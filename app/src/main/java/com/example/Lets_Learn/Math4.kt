package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Math4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math4)

        var math4play = findViewById<Button>(R.id.math4playbtn)
        var math4stop = findViewById<Button>(R.id.math4stopbtn)
        var mp = MediaPlayer()
        math4play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.four)
            )
            mp.prepare()
            mp.start()
        }
        math4stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}