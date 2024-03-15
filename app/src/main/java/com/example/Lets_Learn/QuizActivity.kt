package com.example.Lets_Learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val quiz1Actbtn = findViewById<Button>(R.id.lvl1)
        quiz1Actbtn.setOnClickListener {
            val Intent = Intent(this,quizlevel1::class.java)
            startActivity(Intent)
        }

        val quiz2Actbtn = findViewById<Button>(R.id.lvl2)
        quiz2Actbtn.setOnClickListener {
            val Intent = Intent(this,quizlevel2::class.java)
            startActivity(Intent)
        }

    }
}