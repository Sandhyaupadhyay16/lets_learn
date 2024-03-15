package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class english3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english3)

        var english3play = findViewById<Button>(R.id.english3playbtn)
        var english3stop = findViewById<Button>(R.id.english3stopbtn)
        var mp = MediaPlayer()
        english3play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.c)
            )
            mp.prepare()
            mp.start()
        }
        english3stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}