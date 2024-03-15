package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Math2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math2)

        var math2play = findViewById<Button>(R.id.math2playbtn)
        var math2stop = findViewById<Button>(R.id.math2stopbtn)
        var mp = MediaPlayer()
        math2play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.two)
            )
            mp.prepare()
            mp.start()
        }
        math2stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}