package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException

class english2 : AppCompatActivity() {
    private var mp: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english2)

        val english2play = findViewById<Button>(R.id.english2playbtn)
        val english2stop = findViewById<Button>(R.id.english2stopbtn)

        english2play.setOnClickListener {
            if (mp == null) {
                mp = MediaPlayer()
            }

            try {
                if (!mp!!.isPlaying) {
                    mp?.setDataSource(
                        this,
                        Uri.parse("android.resource://" + this.packageName + "/" + R.raw.b)
                    )
                    mp?.prepare()
                    mp?.start()
                }
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(this, "Failed to start playback", Toast.LENGTH_SHORT).show()
            }
        }

        english2stop.setOnClickListener {
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
