package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ColoresWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colores_word_list)
    }

    fun color(view: View?) {
        Helper.gallery(this, R.string.colores_color, R.drawable.colores_color, R.raw.colores_color)
    }

    fun amarillo(view: View?) {
        Helper.gallery(
            this,
            R.string.colores_amarillo,
            R.drawable.colores_amarillo,
            R.raw.colores_amarillo
        )
    }

    fun azul(view: View?) {
        Helper.gallery(this, R.string.colores_azul, R.drawable.colores_azul, R.raw.colores_azul)
    }

    fun blanco(view: View?) {
        Helper.gallery(
            this,
            R.string.colores_blanco,
            R.drawable.colores_blanco,
            R.raw.colores_blanco
        )
    }

    fun cafemarron(view: View?) {
        Helper.gallery(this, R.string.colores_cafe, R.drawable.colores_cafe, R.raw.colores_cafe)
    }

    fun celeste(view: View?) {
        Helper.gallery(
            this,
            R.string.colores_celeste,
            R.drawable.colores_celeste,
            R.raw.colores_celeste
        )
    }

    fun gris(view: View?) {
        Helper.gallery(this, R.string.colores_gris, R.drawable.colores_gris, R.raw.colores_gris)
    }

    fun lila(view: View?) {
        Helper.gallery(this, R.string.colores_lila, R.drawable.colores_lila, R.raw.colores_lila)
    }

    fun morado(view: View?) {
        Helper.gallery(
            this,
            R.string.colores_morado,
            R.drawable.colores_morado,
            R.raw.colores_morado
        )
    }

    fun naranja(view: View?) {
        Helper.gallery(
            this,
            R.string.colores_naranja,
            R.drawable.colores_naranja,
            R.raw.colores_naranja
        )
    }

    fun negro(view: View?) {
        Helper.gallery(this, R.string.colores_negro, R.drawable.colores_negro, R.raw.colores_negro)
    }

    fun rojo(view: View?) {
        Helper.gallery(this, R.string.colores_rojo, R.drawable.colores_rojo, R.raw.colores_rojo)
    }

    fun rosa(view: View?) {
        Helper.gallery(this, R.string.colores_rosa, R.drawable.colores_rosa, R.raw.colores_rosa)
    }

    fun verde(view: View?) {
        Helper.gallery(this, R.string.colores_verde, R.drawable.colores_verde, R.raw.colores_verde)
    }
}