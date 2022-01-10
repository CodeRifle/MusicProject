package com.example.musicproject

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var player1: MediaPlayer? = null
    private var player2: MediaPlayer? = null
    private var player3: MediaPlayer? = null
    private var player4: MediaPlayer? = null
    private var player5: MediaPlayer? = null
    private var player6: MediaPlayer? = null

    fun playHitHatOpen(view: View?) {
        player1?.start()
    }

    fun playSnare(view: View?) {
        player2?.start()
    }

    fun playKick(view: View?) {
        player3?.start()
    }

    fun playCowbell(view: View?) {
        player4?.start()
    }

    fun playClap(view: View?) {
        player5?.start()
    }

    fun playBongo(view: View?) {
        player6?.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player1 = MediaPlayer.create(this, R.raw.hithatopen)
        player2 = MediaPlayer.create(this, R.raw.snare)
        player3 = MediaPlayer.create(this, R.raw.kick)
        player4 = MediaPlayer.create(this, R.raw.cowbell)
        player5 = MediaPlayer.create(this, R.raw.clap)
        player6 = MediaPlayer.create(this, R.raw.bongo)
    }
}