package com.google.mlkit.vision.demo.kotlin

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.vision.demo.R



class CheckBmi : AppCompatActivity() {

    private lateinit var editTextHeight : EditText
    private lateinit var editTextWeight : EditText
    private lateinit var calculate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_bmi)

        editTextHeight = findViewById(R.id.editTextHeight)
        editTextWeight = findViewById(R.id.editTextWeight)
        calculate = findViewById(R.id.calculate)


        calculate.setOnClickListener{
            if (editTextHeight.text.isEmpty() || editTextWeight.text.isEmpty()){
                Toast.makeText(applicationContext,"Fill Data", Toast.LENGTH_SHORT).show()

            }
            else{

                val height: Double = editTextHeight.text.toString().toDouble()
                val weight: Double = editTextWeight.text.toString().toDouble()


                startActivity(Intent(this, ResultBmi::class.java)
                    .putExtra("height",height)
                    .putExtra("weight",weight))

            }
//else
        }

    }

}