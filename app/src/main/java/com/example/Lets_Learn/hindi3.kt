package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hindi3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi3)


        var hindi3play = findViewById<Button>(R.id.play3btn)
        var hindi3stop = findViewById<Button>(R.id.stop3btn)
        var mp = MediaPlayer()
        hindi3play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.chhotie)
            )
            mp.prepare()
            mp.start()
        }
        hindi3stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}