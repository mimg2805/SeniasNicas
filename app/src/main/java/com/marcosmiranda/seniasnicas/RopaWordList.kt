package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class RopaWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ropa_word_list)
    }

    fun blusa(view: View?) {
        gallery(this, R.string.ropa_blusa, R.drawable.ropa_blusa, R.raw.ropa_blusa)
    }

    fun calcetines(view: View?) {
        gallery(this, R.string.ropa_calcetines, R.drawable.ropa_calcetines, R.raw.ropa_calcetines)
    }

    fun calzon(view: View?) {
        gallery(this, R.string.ropa_calzon, R.drawable.ropa_calzon, R.raw.ropa_calzon)
    }

    fun calzoncillo(view: View?) {
        gallery(
            this,
            R.string.ropa_calzoncillo,
            R.drawable.ropa_calzoncillo,
            R.raw.ropa_calzoncillo
        )
    }

    fun camisa(view: View?) {
        gallery(this, R.string.ropa_camisa, R.drawable.ropa_camisa, R.raw.ropa_camisa)
    }

    fun falda(view: View?) {
        gallery(this, R.string.ropa_falda, R.drawable.ropa_falda, R.raw.ropa_falda)
    }

    fun gorra(view: View?) {
        gallery(this, R.string.ropa_gorra, R.drawable.ropa_gorra, R.raw.ropa_gorra)
    }

    fun pantalon(view: View?) {
        gallery(this, R.string.ropa_pantalon, R.drawable.ropa_pantalon, R.raw.ropa_pantalon)
    }

    fun shorts(view: View?) {
        gallery(this, R.string.ropa_shorts, R.drawable.ropa_shorts, R.raw.ropa_shorts)
    }

    fun sombrero(view: View?) {
        gallery(this, R.string.ropa_sombrero, R.drawable.ropa_sombrero, R.raw.ropa_sombrero)
    }

    fun tacones(view: View?) {
        gallery(this, R.string.ropa_tacones, R.drawable.ropa_tacones, R.raw.ropa_tacones)
    }

    fun tenis(view: View?) {
        gallery(this, R.string.ropa_tenis, R.drawable.ropa_tenis, R.raw.ropa_tenis)
    }

    fun trajedebanio(view: View?) {
        gallery(
            this,
            R.string.ropa_trajedebaño,
            R.drawable.ropa_trajedebanio,
            R.raw.ropa_trajedebanio
        )
    }

    fun vestido(view: View?) {
        gallery(this, R.string.ropa_vestido, R.drawable.ropa_vestido, R.raw.ropa_vestido)
    }

    fun zapatos(view: View?) {
        gallery(this, R.string.ropa_zapatos, R.drawable.ropa_zapatos, R.raw.ropa_zapatos)
    }
}