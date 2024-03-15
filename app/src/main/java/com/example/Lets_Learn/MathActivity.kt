package com.example.Lets_Learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MathActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

        val math1btn = findViewById<Button>(R.id.Mathabtn)
        math1btn.setOnClickListener {
            val Intent = Intent(this,Math1::class.java)
            startActivity(Intent)
        }

        val math2btn = findViewById<Button>(R.id.Mathbbtn)
        math2btn.setOnClickListener {
            val Intent = Intent(this,Math2::class.java)
            startActivity(Intent)
        }

        val math3btn = findViewById<Button>(R.id.Mathcbtn)
        math3btn.setOnClickListener {
            val Intent = Intent(this,Math3::class.java)
            startActivity(Intent)
        }

        val math4btn = findViewById<Button>(R.id.Mathdbtn)
        math4btn.setOnClickListener {
            val Intent = Intent(this,Math4::class.java)
            startActivity(Intent)
        }
    }
}