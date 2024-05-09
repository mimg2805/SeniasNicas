package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.media.PlaybackParams
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.room.Room
import com.google.android.material.switchmaterial.SwitchMaterial


class Galeria : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)

        val assets = applicationContext.assets

        val letraId = intent.getIntExtra("letra", 0)
        val palabraId = intent.getIntExtra("palabra", 0)
        Log.e("letra", letraId.toString())
        Log.e("palabra", palabraId.toString())

        var tvGaleriaText = ""
        var resName = ""

        val tvGaleria = findViewById<TextView>(R.id.activity_galeria_tv_galeria)
        val ivGaleria = findViewById<ImageView>(R.id.activity_galeria_iv_galeria)
        val vvGaleria = findViewById<VideoView>(R.id.activity_galeria_vv_galeria)
        val swGaleria = findViewById<SwitchMaterial>(R.id.activity_galeria_sw_galeria)

        val mc = MediaController(this, false)
        vvGaleria.setMediaController(mc)
        vvGaleria.setOnPreparedListener { mp ->
            val pbParams = PlaybackParams()
            pbParams.setSpeed(0.5f)
            mp.playbackParams = pbParams
        }

        val db = Room.databaseBuilder(applicationContext, Database::class.java, "SeniasNicas")
            .createFromAsset("databases/SeniasNicas.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
        if (letraId != 0) {
            val letra = db.letraDao().get(letraId)
            val letraTxt = letra.texto
            val letraTxtLower = letraTxt.lowercase()

            tvGaleriaText = letraTxt
            resName = "letras_${letraTxtLower}"
        } else if (palabraId != 0) {
            val palabra = db.palabraDao().get(palabraId)
            val palabraTxt = palabra.texto
            val palabraTxtLower = palabraTxt.lowercase()
            val categoriaTxt = db.categoriaDao().get(palabra.categoria).nombre
            val categoriaTxtLower = categoriaTxt.lowercase()

            tvGaleriaText = palabraTxt
            resName = "${categoriaTxtLower}_${palabraTxtLower}"
        }

        tvGaleria.text = tvGaleriaText
        ivGaleria.setImageResource(resources.getIdentifier(resName, "drawable", packageName))
        vvGaleria.setVideoURI(Uri.parse("android.resource://$packageName/" + resources.getIdentifier(resName, "raw", packageName)))

        swGaleria.setOnCheckedChangeListener { _, checked ->
            if (!checked) { // Video
                ivGaleria.visibility = View.INVISIBLE
                vvGaleria.visibility = View.VISIBLE
                vvGaleria.start()
                swGaleria.text = getString(R.string.galeria_video)
            } else { // Imagen
                ivGaleria.visibility = View.VISIBLE
                vvGaleria.visibility = View.INVISIBLE
                vvGaleria.stopPlayback()
                swGaleria.text = getString(R.string.galeria_imagen)
            }
        }
    }
}