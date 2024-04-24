package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class EmergenciasWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergencias_word_list)
    }

    fun ayudame(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_ayudame,
            R.drawable.emergencias_ayudame,
            R.raw.emergencias_ayudame
        )
    }

    fun ambulancia(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_ambulancia,
            R.drawable.emergencias_ambulancia,
            R.raw.emergencias_ambulancia
        )
    }

    fun dolor(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_dolor,
            R.drawable.emergencias_dolor,
            R.raw.emergencias_dolor
        )
    }

    fun dolordecabeza(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_dolordecabeza,
            R.drawable.emergencias_dolordecabeza,
            R.raw.emergencias_dolordecabeza
        )
    }

    fun hospital(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_hospital,
            R.drawable.emergencias_hospital,
            R.raw.emergencias_hospital
        )
    }

    fun sangre(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_sangre,
            R.drawable.emergencias_sangre,
            R.raw.emergencias_sangre
        )
    }

    fun temblor(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_temblor,
            R.drawable.emergencias_temblor,
            R.raw.emergencias_temblor
        )
    }

    fun terremoto(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_terremoto,
            R.drawable.emergencias_terremoto,
            R.raw.emergencias_terremoto
        )
    }

    fun vomito(view: View?) {
        Helper.gallery(
            this,
            R.string.emergencias_vomito,
            R.drawable.emergencias_vomito,
            R.raw.emergencias_vomito
        )
    }
}