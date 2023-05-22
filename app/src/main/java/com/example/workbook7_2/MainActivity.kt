package com.example.workbook7_2

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btn_play: Button? = null
    var btn_stop: Button? = null
    var mediaPlayer: MediaPlayer? = null

    //액티비티 종료시 실행되는 부분
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_play = findViewById(R.id.btn_play)
        btn_stop = findViewById(R.id.btn_stop)

        //재생버튼 눌렀을때
        btn_play?.setOnClickListener {
            mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.music)
            mediaPlayer?.start()
        }

        //정지버튼 눌렀을때
        btn_stop?.setOnClickListener {
            mediaPlayer?.let {
                if (it.isPlaying) {
                    it.stop()
                    it.reset()
                }
            }
        }
    }
}