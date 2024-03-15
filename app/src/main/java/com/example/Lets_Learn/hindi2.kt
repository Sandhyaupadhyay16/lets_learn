package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hindi2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi2)


        var hindi2play = findViewById<Button>(R.id.play2btn)
        var hindi2stop = findViewById<Button>(R.id.stop2btn)
        var mp = MediaPlayer()
        hindi2play.setOnClickListener {
            mp.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.badaa)
            )
            mp.prepare()
            mp.start()
        }
        hindi2stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp = MediaPlayer()
        }
    }
}