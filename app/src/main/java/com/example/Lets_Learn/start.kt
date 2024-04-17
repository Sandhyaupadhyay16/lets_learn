package com.example.Lets_Learn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class start : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val startloginbtn = findViewById<Button>(R.id.loginstart)
          startloginbtn.setOnClickListener {
              val Intent = Intent(this,MainActivity::class.java)
              startActivity(Intent)
          }

        val startsigninbtn = findViewById<Button>(R.id.siginstart)
          startsigninbtn.setOnClickListener {
              val Intent = Intent(this,signin::class.java)
              startActivity(Intent)
          }
    }

}