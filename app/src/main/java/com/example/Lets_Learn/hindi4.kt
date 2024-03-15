package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hindi4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi4)


        var hindi4play = findViewById<Button>(R.id.hplay4btn)
        var hindi4stop = findViewById<Button>(R.id.hstop4btn)
        var mp = MediaPlayer()
        hindi4play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.badie)
            )
            mp.prepare()
            mp.start()
        }
        hindi4stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}