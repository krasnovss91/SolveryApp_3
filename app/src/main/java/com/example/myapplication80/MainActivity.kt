package com.example.myapplication80

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //при нажатии на кнопки открывать 1 и 2 фрагменты соответственно
        val button1 = findViewById<AppCompatButton>(R.id.button1)
        val button2 = findViewById<AppCompatButton>(R.id.button2)

        button1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
               val toast = Toast.makeText(applicationContext, "Нажата кнопка 1",Toast.LENGTH_SHORT)
                toast.show()
            }

        })

        button2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
              val toast = Toast.makeText(applicationContext,"Нажата кнопка 2", Toast.LENGTH_SHORT)
                toast.show()
            }
        })
    }//http://developer.alexanderklimov.ru/android/fragment2.php
}