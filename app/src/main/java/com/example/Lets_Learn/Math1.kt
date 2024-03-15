package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Math1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math1)

        var math1play = findViewById<Button>(R.id.math1playbtn)
        var math1stop = findViewById<Button>(R.id.math1stopbtn)
        var mp = MediaPlayer()
        math1play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.one)
            )
            mp.prepare()
            mp.start()
        }
        math1stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}