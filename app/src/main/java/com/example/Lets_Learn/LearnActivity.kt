package com.example.Lets_Learn

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)


        val hindiActbutton = findViewById<ImageButton>(R.id.hindibtn)
        hindiActbutton.setOnClickListener{
         val Intent = Intent(this,hindiActivity::class.java)
         startActivity(Intent)
        }

        val engActbutton = findViewById<ImageButton>(R.id.engbtn)
        engActbutton.setOnClickListener{
            val Intent = Intent(this,EngActivity::class.java)
            startActivity(Intent)
        }

        val mathActbutton = findViewById<ImageButton>(R.id.mthbtn)
        mathActbutton.setOnClickListener{
            val Intent = Intent(this,MathActivity::class.java)
            startActivity(Intent)
        }

        val colActButton = findViewById<ImageButton>(R.id.colorbtn)
          colActButton.setOnClickListener{
              val Intent = Intent(this,Color::class.java)
              startActivity(Intent)
          }

        val FruitsActButton = findViewById<ImageButton>(R.id.fruitsbtn)
        FruitsActButton.setOnClickListener {
            val Intent = Intent(this,Fruits::class.java)
            startActivity(Intent)
        }

        val VeggieActButton = findViewById<ImageButton>(R.id.veggiebtn)
        VeggieActButton.setOnClickListener {
            val Intent = Intent(this,Veggies::class.java)
            startActivity(Intent)
        }
    }
}