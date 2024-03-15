package com.example.Lets_Learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EngActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng)

        val english1btn = findViewById<Button>(R.id.abtn)
        english1btn.setOnClickListener {
            val Intent = Intent(this,english1::class.java)
            startActivity(Intent)
        }

        val english2btn = findViewById<Button>(R.id.bbtn)
        english2btn.setOnClickListener {
            val Intent = Intent(this,english2::class.java)
            startActivity(Intent)
        }

        val english3btn = findViewById<Button>(R.id.cbtn)
        english3btn.setOnClickListener {
            val Intent =Intent(this,english3::class.java)
            startActivity(Intent)
        }

        val english4btn = findViewById<Button>(R.id.dbtn)
        english4btn.setOnClickListener {
            val Intent = Intent(this,english4::class.java)
            startActivity(Intent)
        }
    }
}