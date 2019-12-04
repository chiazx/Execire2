package com.example.execire2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weight:EditText=findViewById(R.id.editTextWeight)
        var height:EditText=findViewById(R.id.editTextHeight)

        var bmi:TextView=findViewById(R.id.textViewBMI)
        var image:ImageView=findViewById(R.id.imageViewProfile)

        var count:Button=findViewById(R.id.buttonCalculate)
        var reset:Button=findViewById(R.id.buttonReset)

        count.setOnClickListener{
            var wei:Double=weight.text.toString().toDouble()
            var hei:Double=height.text.toString().toDouble()/100

            var BMI:Double="%.2f".format(wei/(hei*hei)).toDouble()
            bmi.text="BMI :" + BMI.toString()//try one

            if(BMI<18.5)
            {
                image.setImageResource(R.drawable.under)
            }
            else if(BMI>=18.5 && BMI<=24.9)
            {
                image.setImageResource(R.drawable.normal)
            }
            else
            {
                image.setImageResource(R.drawable.over)
            }
        }
        reset.setOnClickListener{
            weight.setText("")
            height.setText("")
            bmi.text="BMI :"
            image.setImageResource(R.drawable.empty)
        }

    }
}
