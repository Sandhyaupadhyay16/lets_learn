package com.example.Lets_Learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hindiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi)

        val onebtn = findViewById<Button>(R.id.onebtn)
        onebtn.setOnClickListener {
            val Intent = Intent(this, hindi1::class.java)
            startActivity(Intent)
        }

        val twobtn = findViewById<Button>(R.id.twobtn)
        twobtn.setOnClickListener {
            val Intent = Intent(this, hindi2::class.java)
            startActivity(Intent)
        }

        val threebtn  = findViewById<Button>(R.id.threebtn)
        threebtn.setOnClickListener {
            val Intent = Intent ( this, hindi3::class.java)
            startActivity(Intent)
        }
        val fourbtn = findViewById<Button>(R.id.fourbtn)
        fourbtn.setOnClickListener {
            val Intent = Intent( this, hindi4::class.java)
            startActivity(Intent)
        }
    }
}




