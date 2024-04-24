package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class SaludosWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludos_word_list)
    }

    fun hola(view: View?) {
        gallery(this, R.string.saludos_hola, R.drawable.saludos_hola, R.raw.saludos_hola)
    }

    fun soysordo(view: View?) {
        gallery(
            this,
            R.string.saludos_soysordo,
            R.drawable.saludos_soysordo,
            R.raw.saludos_soysordo
        )
    }

    fun soyhipoacusico(view: View?) {
        gallery(
            this,
            R.string.saludos_soyhipoacusico,
            R.drawable.saludos_soyhipoacusico,
            R.raw.saludos_soyhipoacusico
        )
    }

    fun bienvenidos(view: View?) {
        gallery(
            this,
            R.string.saludos_bienvenidos,
            R.drawable.saludos_bienvenidos,
            R.raw.saludos_bienvenidos
        )
    }

    fun buenosdias(view: View?) {
        gallery(
            this,
            R.string.saludos_buenosdias,
            R.drawable.saludos_buenosdias,
            R.raw.saludos_buenosdias
        )
    }

    fun buenastardes(view: View?) {
        gallery(
            this,
            R.string.saludos_buenastardes,
            R.drawable.saludos_buenastardes,
            R.raw.saludos_buenastardes
        )
    }

    fun buenasnoches(view: View?) {
        gallery(
            this,
            R.string.saludos_buenasnoches,
            R.drawable.saludos_buenasnoches,
            R.raw.saludos_buenasnoches
        )
    }

    fun comoestas(view: View?) {
        gallery(
            this,
            R.string.saludos_comoestas,
            R.drawable.saludos_comoestas,
            R.raw.saludos_comoestas
        )
    }

    fun bien(view: View?) {
        gallery(this, R.string.saludos_bien, R.drawable.saludos_bien, R.raw.saludos_bien)
    }

    fun mal(view: View?) {
        gallery(this, R.string.saludos_mal, R.drawable.saludos_mal, R.raw.saludos_mal)
    }

    fun gracias(view: View?) {
        gallery(this, R.string.saludos_gracias, R.drawable.saludos_gracias, R.raw.saludos_gracias)
    }

    fun adios(view: View?) {
        gallery(this, R.string.saludos_adios, R.drawable.saludos_adios, R.raw.saludos_adios)
    }
}