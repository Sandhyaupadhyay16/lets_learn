package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Math3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math3)

        var math3play = findViewById<Button>(R.id.math3playbtn)
        var math3stop = findViewById<Button>(R.id.math3stopbtn)
        var mp = MediaPlayer()
        math3play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.three)
            )
            mp.prepare()
            mp.start()
        }
        math3stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}