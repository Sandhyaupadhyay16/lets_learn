package com.example.Lets_Learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

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
    }
}