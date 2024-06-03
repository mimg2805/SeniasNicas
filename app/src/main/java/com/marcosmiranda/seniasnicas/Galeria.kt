package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.media.PlaybackParams
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.SwitchCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.room.Room
import com.github.chrisbanes.photoview.PhotoView

class Galeria : Activity() {

    private lateinit var tvGaleriaTitle : TextView
    private lateinit var pvGaleriaImage : PhotoView
    private lateinit var vvGaleriaVideo : VideoView
    private lateinit var btnVideoRestart : Button
    private lateinit var btnVideoPausePlay : Button
    private lateinit var swGaleria : SwitchCompat
    private lateinit var tstNoVideo : Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)

        val letraId = intent.getIntExtra("letra", 0)
        val palabraId = intent.getIntExtra("palabra", 0)

        tvGaleriaTitle = findViewById(R.id.activity_galeria_tv_galeria_title)
        pvGaleriaImage = findViewById(R.id.activity_galeria_pv_galeria_image)
        vvGaleriaVideo = findViewById(R.id.activity_galeria_vv_galeria_video)
        btnVideoRestart = findViewById(R.id.activity_galeria_btn_video_restart)
        btnVideoPausePlay = findViewById(R.id.activity_galeria_btn_video_pause_play)
        swGaleria = findViewById(R.id.activity_galeria_sw_galeria)
        tstNoVideo = Toast.makeText(this, R.string.galeria_no_video, Toast.LENGTH_LONG)

        var tvGaleriaText = ""
        var resId: Int
        var resName = ""
        var imgBitmap: Bitmap? = null

        // Set playback speed to half
        vvGaleriaVideo.setOnPreparedListener { mp ->
            val pbParams = PlaybackParams()
            pbParams.setSpeed(0.5f)
            mp.playbackParams = pbParams
        }

        // Custom media controls
        btnVideoRestart.setOnClickListener {
            vvGaleriaVideo.resume()
            btnVideoPausePlay.background = AppCompatResources.getDrawable(this, android.R.drawable.ic_media_pause)
        }
        btnVideoPausePlay.setOnClickListener {
            if (vvGaleriaVideo.isPlaying) {
                vvGaleriaVideo.pause()
                btnVideoPausePlay.background = AppCompatResources.getDrawable(this, android.R.drawable.ic_media_play)
            } else {
                vvGaleriaVideo.start()
                btnVideoPausePlay.background = AppCompatResources.getDrawable(this, android.R.drawable.ic_media_pause)
            }
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
            resId = resources.getIdentifier(resName, "drawable", packageName)
            imgBitmap = AppCompatResources.getDrawable(this, resId)!!.toBitmap()
        } else if (palabraId != 0) {
            val palabra = db.palabraDao().get(palabraId)
            val palabraTxt = palabra.texto
            val palabraTxtLower = palabraTxt.lowercase()
            val categoriaTxt = db.categoriaDao().get(palabra.categoria).nombre
            val categoriaTxtLower = categoriaTxt.lowercase()

            tvGaleriaText = palabraTxt
            resName = "${categoriaTxtLower}_${palabraTxtLower}"
            imgBitmap = createWordImage(palabraTxtLower)
        }

        tvGaleriaTitle.text = tvGaleriaText

        // Load image
        pvGaleriaImage.setImageBitmap(imgBitmap)

        // Load video
        resId = resources.getIdentifier(resName, "raw", packageName)
        val videoUri = Uri.parse("android.resource://$packageName/$resId")
        val videoFileExists = resId != 0
        if (videoFileExists) {
            vvGaleriaVideo.setVideoURI(videoUri)
            swGaleria.visibility = View.VISIBLE
            tstNoVideo.cancel()
        } else {
            galleryChange("image")
            swGaleria.visibility = View.INVISIBLE
            tstNoVideo.cancel()
            tstNoVideo.show()
        }

        swGaleria.setOnCheckedChangeListener { _, checked ->
            if (!checked) { // Video
                galleryChange("video")
            } else { // Imagen
                galleryChange("image")
            }
        }
    }

    private fun galleryChange(mode: String = "")
    {
        when (mode) {
            "image" -> {
                pvGaleriaImage.visibility = View.VISIBLE
                vvGaleriaVideo.visibility = View.INVISIBLE
                vvGaleriaVideo.stopPlayback()
                btnVideoRestart.visibility = View.INVISIBLE
                btnVideoPausePlay.visibility = View.INVISIBLE
                swGaleria.text = getString(R.string.galeria_imagen)
            }
            "video" -> {
                pvGaleriaImage.visibility = View.INVISIBLE
                vvGaleriaVideo.visibility = View.VISIBLE
                vvGaleriaVideo.start()
                btnVideoRestart.visibility = View.VISIBLE
                btnVideoPausePlay.visibility = View.VISIBLE
                btnVideoPausePlay.background = AppCompatResources.getDrawable(this, android.R.drawable.ic_media_pause)
                swGaleria.text = getString(R.string.galeria_video)
            }
            else -> return
        }
    }

    private fun createWordImage(word: String = "hola"): Bitmap {
        val letterBitmapsList = mutableListOf<Bitmap>()
        val wordBitmapRowsList = mutableListOf<Bitmap>()
        var wordBitmapWidth = 0
        var wordBitmapHeight = 500
        var wordBitmapMaxWidth = 0
        val wordBitmapRowHeight = 500
        val wordBitmapWidthMargin = 100
        val wordBitmapHeightMargin = 100
        val wordBitmapConf = Bitmap.Config.ARGB_8888

        // Handle special cases: special characters and compound letters (ch, ll, rr)
        val wordChars = word.toCharArray()
        val wordArr = mutableListOf<String>()
        val ignoreChars = listOf('¿', '?', '¡', '!')
        var prevChr = ' '
        wordChars.forEach { chr ->
            if (ignoreChars.contains(chr)) return@forEach

            if ((prevChr == 'c' && chr == 'h') ||
                (prevChr == 'l' && chr == 'l') ||
                (prevChr == 'r' && chr == 'r')) {
                wordArr.removeLast()
                wordArr.add("$prevChr$chr")
            } else {
                wordArr.add("$chr")
            }

            prevChr = chr
        }

        // For each letter, load corresponding bitmap
        wordArr.forEach { chr ->
            val imgBitmap: Bitmap?
            if (chr == " ") {
                imgBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888)
                if (wordBitmapWidth > wordBitmapMaxWidth) wordBitmapMaxWidth = wordBitmapWidth
                wordBitmapWidth = 0
                // wordBitmapHeight += wordBitmapRowHeight + wordBitmapHeightMargin
            } else {
                val drawableName = "letras_" + when (chr) {
                    "á"     -> "a"
                    "é"     -> "e"
                    "í"     -> "i"
                    "ó"     -> "o"
                    "ú"     -> "u"
                    "ñ"     -> "enie"
                    else    -> chr
                }

                val imgDrawableId = resources.getIdentifier(drawableName, "drawable", packageName)
                imgBitmap = AppCompatResources.getDrawable(this, imgDrawableId)!!.toBitmap()
            }
            letterBitmapsList.add(imgBitmap)
            wordBitmapWidth += imgBitmap.width + wordBitmapWidthMargin
        }

        if (wordBitmapWidth > wordBitmapMaxWidth) wordBitmapMaxWidth = wordBitmapWidth
        wordBitmapMaxWidth -= wordBitmapWidthMargin

        // Draw all bitmaps in rows
        var wordBitmapRow = Bitmap.createBitmap(wordBitmapMaxWidth, wordBitmapRowHeight, wordBitmapConf)
        var wordCanvasRow = Canvas(wordBitmapRow)
        var rowCurrentLeft = 0
        var rowCurrentTop = 0
        var rowCurrentBottom = wordBitmapRowHeight
        letterBitmapsList.forEach { ltrImg ->
            val ltrImgWidth = ltrImg.width
            val ltrImgHeight = ltrImg.height
            val newLine = ltrImgWidth == 100 && ltrImgHeight == 100
            val lastLetter = ltrImg == letterBitmapsList.last()

            val imgDestRect = Rect(rowCurrentLeft, rowCurrentTop, ltrImgWidth + rowCurrentLeft, rowCurrentBottom)
            wordCanvasRow.drawBitmap(ltrImg, null, imgDestRect, null)
            rowCurrentLeft += wordBitmapWidthMargin
            if (!newLine) rowCurrentLeft += ltrImgWidth

            if (newLine || lastLetter) {
                // Clip bitmap and add to list
                rowCurrentLeft -= wordBitmapWidthMargin
                if (newLine) rowCurrentLeft -= ltrImgWidth
                wordBitmapRow = Bitmap.createBitmap(wordBitmapRow, 0, 0, rowCurrentLeft, wordBitmapRow.height)
                wordBitmapRowsList.add(wordBitmapRow)

                // Reset
                wordBitmapRow = Bitmap.createBitmap(wordBitmapMaxWidth, wordBitmapRowHeight, wordBitmapConf)
                wordCanvasRow = Canvas(wordBitmapRow)
                rowCurrentLeft = 0
                rowCurrentTop = 0
                rowCurrentBottom = wordBitmapRowHeight

                // currentLeft = 0
                // currentTop += wordBitmapRowHeight + wordBitmapHeightMargin
                // currentBottom += wordBitmapRowHeight + wordBitmapHeightMargin
                return@forEach
            }
        }

        // Draw all rows
        if (wordBitmapRowsList.count() > 1) {
            wordBitmapHeight = (wordBitmapHeight + wordBitmapHeightMargin) * wordBitmapRowsList.count()
            wordBitmapHeight -= wordBitmapHeightMargin
        }
        val wordBitmap = Bitmap.createBitmap(wordBitmapMaxWidth, wordBitmapHeight, wordBitmapConf)
        val wordCanvas = Canvas(wordBitmap)
        var currentLeft = 0
        var currentTop = 0
        var currentBottom = wordBitmapRowHeight
        wordBitmapRowsList.forEach { rowImg ->
            val rowImgWidth = rowImg.width
            // val rowImgHeight = rowImg.height

            // Center row if width is not max
            if (rowImgWidth < wordBitmapMaxWidth) currentLeft = (wordBitmapMaxWidth - rowImgWidth) / 2
            val imgDestRect = Rect(currentLeft, currentTop, rowImgWidth + currentLeft, currentBottom)
            wordCanvas.drawBitmap(rowImg, null, imgDestRect, null)
            currentTop += wordBitmapRowHeight + wordBitmapHeightMargin
            currentBottom += wordBitmapRowHeight + wordBitmapHeightMargin
        }

        return wordBitmap
    }
}