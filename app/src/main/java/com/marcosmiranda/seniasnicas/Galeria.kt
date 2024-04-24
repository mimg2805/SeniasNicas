package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.media.PlaybackParams
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Galeria : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
        val EXTRA_TITLE = getString(R.string.extra_title)
        val EXTRA_IMAGE = getString(R.string.extra_image)
        val EXTRA_VIDEO = getString(R.string.extra_video)
        val intent = intent
        val title = intent.getIntExtra(EXTRA_TITLE, 0)
        val uriImage = intent.getParcelableExtra<Uri>(EXTRA_IMAGE)
        val uriVideo = intent.getParcelableExtra<Uri>(EXTRA_VIDEO)
        val txtView = findViewById<TextView>(R.id.txtViewWord)
        txtView.setText(title)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageURI(uriImage)
        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.setVideoURI(uriVideo)
        val mediaCont = MediaController(this, false)
        videoView.setMediaController(mediaCont)
        videoView.setOnPreparedListener { mp ->
            val pbParams = PlaybackParams()
            pbParams.setSpeed(0.5f)
            mp.playbackParams = pbParams
        }
        videoView.start()
    }
}