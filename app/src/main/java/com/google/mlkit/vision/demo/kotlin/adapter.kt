package com.google.mlkit.vision.demo.kotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.mlkit.vision.demo.R
import kotlinx.android.synthetic.main.view.view.*

class adapter(var planet:List<PlanetData>): RecyclerView.Adapter<adapter.myViewHolder>() {

    class myViewHolder(view: View): RecyclerView.ViewHolder(view){
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)

        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null

//        to pass it to the next activiy
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)
        }

        holder.title.text= planet[position].title
        holder.galaxy.text= planet[position].galaxy

        when(planet[position].title!!.toLowerCase()){
            "prone t"->{ dummyImage= R.drawable.pronet}
            "dumbbell shoulder push"->{ dummyImage= R.drawable.dumbbell_shoulder_push_press}
            "cable face pulls"->{ dummyImage= R.drawable.cable_face_pulls}
            "straight arm circles"->{ dummyImage= R.drawable.straight_arm_circles}
            "crab walk"->{ dummyImage= R.drawable.crab_walk}
        }
        holder.planetimg.setImageResource(dummyImage!!)

    }

    override fun getItemCount(): Int {
        return planet.size

    }
}