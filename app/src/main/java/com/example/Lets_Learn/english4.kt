package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class english4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english4)

        var english4play = findViewById<Button>(R.id.english4playbtn)
        var english4stop = findViewById<Button>(R.id.english4stopbtn)
        var mp = MediaPlayer()
        english4play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.d)
            )
            mp.prepare()
            mp.start()
        }
        english4stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}