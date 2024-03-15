package com.example.Lets_Learn

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hindi1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi1)
        

        var play=findViewById<Button>(R.id.playbtn)
        var stop=findViewById<Button>(R.id.stopbtn)
        var mp= MediaPlayer()
        play.setOnClickListener{
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.chhotaa))
            mp.prepare()
            mp.start()
        }
        stop.setOnClickListener{
            mp.stop()
            mp.release()
            mp=MediaPlayer()

        }
    }
}