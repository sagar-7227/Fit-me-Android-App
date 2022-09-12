package com.google.mlkit.vision.demo.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.mlkit.vision.demo.R
import kotlinx.android.synthetic.main.exercise_recycler.*


class Exercise_recycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_recycler)

        my_recycler.adapter=adapter(setData.SetPlanets())
        my_recycler.layoutManager= LinearLayoutManager(this)
    }
}