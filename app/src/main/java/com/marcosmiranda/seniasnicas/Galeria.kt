package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.media.PlaybackParams
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.core.graphics.drawable.toBitmap
import androidx.room.Room
import com.google.android.material.switchmaterial.SwitchMaterial

class Galeria : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)

        val letraId = intent.getIntExtra("letra", 0)
        val palabraId = intent.getIntExtra("palabra", 0)

        var tvGaleriaText = ""
        var resName = ""
        var imgBitmap: Bitmap? = null

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
            imgBitmap = resources.getDrawable(resources.getIdentifier(resName, "drawable", packageName)).toBitmap()
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

        tvGaleria.text = tvGaleriaText
        ivGaleria.setImageBitmap(imgBitmap)
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
        var prevChr = ' '
        wordChars.forEach { chr ->
            if (chr == '¿' || chr == '?' || chr == '¡' || chr == '!') return@forEach

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
                imgBitmap = resources.getDrawable(imgDrawableId).toBitmap()
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