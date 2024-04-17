package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException

class english3 : AppCompatActivity() {
    private var mp: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english3)

        val english3play = findViewById<Button>(R.id.english3playbtn)
        val english3stop = findViewById<Button>(R.id.english3stopbtn)

        english3play.setOnClickListener {
            if (mp == null) {
                mp = MediaPlayer()
            }

            try {
                if (!mp!!.isPlaying) {
                    mp?.setDataSource(
                        this,
                        Uri.parse("android.resource://" + this.packageName + "/" + R.raw.c)
                    )
                    mp?.prepare()
                    mp?.start()
                }
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(this, "Failed to start playback", Toast.LENGTH_SHORT).show()
            }
        }

        english3stop.setOnClickListener {
            mp?.stop()
            mp?.release()
            mp = null
        }
    }

    override fun onStop() {
        super.onStop()
        mp?.release()
        mp = null
    }
}
