package com.example.Lets_Learn

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val learnActbtn = findViewById<ImageButton>(R.id.learn)
        learnActbtn.setOnClickListener {
            val Intent = Intent(this,LearnActivity::class.java)
            startActivity(Intent)
        }
        val quizActbtn = findViewById<ImageButton>(R.id.quiz)
        quizActbtn.setOnClickListener {
            val Intent = Intent(this,QuizActivity::class.java)
            startActivity(Intent)
        }
        val feedActbtn = findViewById<ImageButton>(R.id.feedback)
        feedActbtn.setOnClickListener {
            val Intent = Intent(this,FeedbackActivity::class.java)
            startActivity(Intent)
        }
        val setActbtn = findViewById<ImageButton>(R.id.settings)
        setActbtn.setOnClickListener {
            val Intent = Intent(this,SettingsActivity::class.java)
            startActivity(Intent)
        }


        }
    }