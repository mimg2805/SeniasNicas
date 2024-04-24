package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AnimalesWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animales_word_list)
    }

    fun animales(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_animales,
            R.drawable.animales_animales,
            R.raw.animales_animales
        )
    }

    fun burro(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_burro,
            R.drawable.animales_burro,
            R.raw.animales_burro
        )
    }

    fun caballo(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_caballo,
            R.drawable.animales_caballo,
            R.raw.animales_caballo
        )
    }

    fun cerdo(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_cerdo,
            R.drawable.animales_cerdo,
            R.raw.animales_cerdo
        )
    }

    fun conejo(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_conejo,
            R.drawable.animales_conejo,
            R.raw.animales_conejo
        )
    }

    fun culebra(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_culebra,
            R.drawable.animales_culebra,
            R.raw.animales_culebra
        )
    }

    fun gallina(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_gallina,
            R.drawable.animales_gallina,
            R.raw.animales_gallina
        )
    }

    fun gallo(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_gallo,
            R.drawable.animales_gallo,
            R.raw.animales_gallo
        )
    }

    fun gato(view: View?) {
        Helper.gallery(this, R.string.animales_gato, R.drawable.animales_gato, R.raw.animales_gato)
    }

    fun loro(view: View?) {
        Helper.gallery(this, R.string.animales_loro, R.drawable.animales_loro, R.raw.animales_loro)
    }

    fun pajaro(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_pajaro,
            R.drawable.animales_paloma,
            R.raw.animales_paloma
        )
    }

    fun paloma(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_paloma,
            R.drawable.animales_paloma,
            R.raw.animales_paloma
        )
    }

    fun perro(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_perro,
            R.drawable.animales_perro,
            R.raw.animales_perro
        )
    }

    fun pollito(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_pollito,
            R.drawable.animales_pollito,
            R.raw.animales_pollito
        )
    }

    fun toro(view: View?) {
        Helper.gallery(this, R.string.animales_toro, R.drawable.animales_toro, R.raw.animales_toro)
    }

    fun tortuga(view: View?) {
        Helper.gallery(
            this,
            R.string.animales_tortuga,
            R.drawable.animales_tortuga,
            R.raw.animales_tortuga
        )
    }
}