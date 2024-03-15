package com.example.Lets_Learn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.second_act_btn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this,second::class.java)
            startActivity(Intent)
        }
        
    }
}







