package com.example.finalproject.video

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class VideoViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)
        val videoView = findViewById<VideoView>(R.id.video_view)
        val bundle = intent.extras
        val videoPath = bundle?.getString("videoUrl")
        Log.i("hello", videoPath.toString())
        videoView.setVideoURI(Uri.parse(videoPath))

        // 添加MediaController
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        videoView.start() // 播放视频
    }
}