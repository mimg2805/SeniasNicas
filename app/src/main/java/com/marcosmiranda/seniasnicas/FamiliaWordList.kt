package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FamiliaWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familia_word_list)
    }

    fun amigo(view: View?) {
        Helper.gallery(this, R.string.familia_amigo, R.drawable.familia_amigo, R.raw.familia_amigo)
    }

    fun cuniado(view: View?) {
        Helper.gallery(
            this,
            R.string.familia_cuñado,
            R.drawable.familia_cuniado,
            R.raw.familia_cuniado
        )
    }

    fun esposo(view: View?) {
        Helper.gallery(
            this,
            R.string.familia_esposo,
            R.drawable.familia_esposo,
            R.raw.familia_esposo
        )
    }

    fun hermano(view: View?) {
        Helper.gallery(
            this,
            R.string.familia_hermano,
            R.drawable.familia_hermano,
            R.raw.familia_hermano
        )
    }

    fun mama(view: View?) {
        Helper.gallery(this, R.string.familia_mama, R.drawable.familia_mama, R.raw.familia_mama)
    }

    fun novio(view: View?) {
        Helper.gallery(this, R.string.familia_novio, R.drawable.familia_novio, R.raw.familia_novio)
    }

    fun papa(view: View?) {
        Helper.gallery(this, R.string.familia_papa, R.drawable.familia_papa, R.raw.familia_papa)
    }

    fun primo(view: View?) {
        Helper.gallery(this, R.string.familia_primo, R.drawable.familia_primo, R.raw.familia_primo)
    }

    fun prima(view: View?) {
        Helper.gallery(this, R.string.familia_prima, R.drawable.familia_prima, R.raw.familia_prima)
    }

    fun sobrino(view: View?) {
        Helper.gallery(
            this,
            R.string.familia_sobrino,
            R.drawable.familia_sobrino,
            R.raw.familia_sobrino
        )
    }

    fun tio(view: View?) {
        Helper.gallery(this, R.string.familia_tio, R.drawable.familia_tio, R.raw.familia_tio)
    }
}