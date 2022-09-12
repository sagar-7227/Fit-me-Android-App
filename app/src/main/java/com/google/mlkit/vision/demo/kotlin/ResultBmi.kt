package com.google.mlkit.vision.demo.kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.vision.demo.R
import kotlin.math.roundToInt


class ResultBmi : AppCompatActivity(){

    private lateinit var bmi_result : TextView
    private lateinit var bmi_result_type : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi_result)


        bmi_result = findViewById(R.id.result_bmi)
        bmi_result_type = findViewById(R.id.bmi_decs)

        val height = intent.getDoubleExtra("height",1.0)
        val weight = intent.getDoubleExtra("weight",1.0)
        val result = ((weight / (height*height))*100.0).roundToInt() /100.0

        if (result < 18.5) {
            bmi_result_type.setText("underweight")
            bmi_result.text = result.toString()
        } else if (result >= 18.5 && result < 24.9) {
            bmi_result_type.setText("Healthy")
            bmi_result.text = result.toString()
        } else if (result >= 24.9 && result < 30) {
            bmi_result_type.setText("overweight")
            bmi_result.text = result.toString()
        } else {
            bmi_result_type.setText("Suffer from Obesity")
            bmi_result.text = result.toString()
        }

    }

}