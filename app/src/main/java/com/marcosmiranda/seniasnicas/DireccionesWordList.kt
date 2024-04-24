package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DireccionesWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direcciones_word_list)
    }

    fun arriba(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_arriba,
            R.drawable.direcciones_arriba,
            R.raw.direcciones_arriba
        )
    }

    fun abajo(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_abajo,
            R.drawable.direcciones_abajo,
            R.raw.direcciones_abajo
        )
    }

    fun izquierda(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_izquierda,
            R.drawable.direcciones_izquierda,
            R.raw.direcciones_izquierda
        )
    }

    fun derecha(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_derecha,
            R.drawable.direcciones_derecha,
            R.raw.direcciones_derecha
        )
    }

    fun norte(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_norte,
            R.drawable.direcciones_norte,
            R.raw.direcciones_norte
        )
    }

    fun sur(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_sur,
            R.drawable.direcciones_sur,
            R.raw.direcciones_sur
        )
    }

    fun este(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_este,
            R.drawable.direcciones_este,
            R.raw.direcciones_este
        )
    }

    fun oeste(view: View?) {
        Helper.gallery(
            this,
            R.string.direcciones_oeste,
            R.drawable.direcciones_oeste,
            R.raw.direcciones_oeste
        )
    }
}