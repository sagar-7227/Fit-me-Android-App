

package com.google.mlkit.vision.demo.kotlin

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import com.google.mlkit.vision.demo.R
import com.google.mlkit.vision.demo.kotlin.Google_Login.Companion.EXTRA_NAME
import com.google.mlkit.vision.demo.kotlin.diet.breakfast
import com.google.mlkit.vision.demo.kotlin.diet.dinner
import com.google.mlkit.vision.demo.kotlin.diet.lunch
import com.google.mlkit.vision.demo.kotlin.diet.snacks
import kotlinx.android.synthetic.main.activity_chooser.*
import kotlinx.android.synthetic.main.activity_planet_detail.*

/** Demo app chooser which allows you pick from all available testing Activities. */
class ChooserActivity :
  AppCompatActivity(), ActivityCompat.OnRequestPermissionsResultCallback {

  private lateinit var text_display_name : TextView

  @RequiresApi(VERSION_CODES.LOLLIPOP)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d(TAG, "onCreate")
    setContentView(R.layout.activity_chooser)
    window.decorView.apply { systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }


    text_display_name = findViewById(R.id.textView2)

    text_display_name.text = intent.getStringExtra(EXTRA_NAME)


//    camera part
    cameraxactivity.setOnClickListener{
      val intent= Intent(this,CameraXLivePreviewActivity::class.java)
      startActivity(intent)
    }

//    check bmi part
    textView6.setOnClickListener{
      val intent= Intent(this,CheckBmi::class.java)
      startActivity(intent)
    }

//    exercise part
    imageView3.setOnClickListener{
      val intent= Intent(this,Exercise_recycler::class.java)
      startActivity(intent)
    }

    //    dinner part
    imageView7.setOnClickListener{
      val intent= Intent(this,dinner::class.java)
      startActivity(intent)
    }

    //    breakfast part
    imageView8.setOnClickListener{
      val intent= Intent(this,breakfast::class.java)
      startActivity(intent)
    }

    //    lunch part
    imageView9.setOnClickListener{
      val intent= Intent(this,lunch::class.java)
      startActivity(intent)
    }

    //    Snacks part
    imageView10.setOnClickListener{
      val intent= Intent(this,snacks::class.java)
      startActivity(intent)
    }

//    check covid_bmi
    covid_Tips.setOnClickListener {
      val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public#:~:text=Keep%20physical%20distance%20of%20at,rub%20or%20soap%20and%20water."))
      startActivity(browserIntent)
    }

    //    chat with me
    imageView5.setOnClickListener {
      val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kommunicate.io/livechat-demo?appId=23391e3764efb72e3514cf46b4e53f004&botIds=nicy-zumwg&assignee=nicy-zumwg"))
      startActivity(browserIntent)
    }



  }
//  oncreate

}
