package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class TrabajosWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trabajos_word_list)
    }

    fun abogado(view: View?) {
        gallery(
            this,
            R.string.trabajos_abogado,
            R.drawable.trabajos_abogado,
            R.raw.trabajos_abogado
        )
    }

    fun chofer(view: View?) {
        gallery(this, R.string.trabajos_chofer, R.drawable.trabajos_chofer, R.raw.trabajos_chofer)
    }

    fun dentista(view: View?) {
        gallery(
            this,
            R.string.trabajos_dentista,
            R.drawable.trabajos_dentista,
            R.raw.trabajos_dentista
        )
    }

    fun doctor(view: View?) {
        gallery(this, R.string.trabajos_doctor, R.drawable.trabajos_doctor, R.raw.trabajos_doctor)
    }

    fun enfermera(view: View?) {
        gallery(
            this,
            R.string.trabajos_enfermera,
            R.drawable.trabajos_enfermera,
            R.raw.trabajos_enfermera
        )
    }

    fun general(view: View?) {
        gallery(
            this,
            R.string.trabajos_general,
            R.drawable.trabajos_general,
            R.raw.trabajos_general
        )
    }

    fun jefe(view: View?) {
        gallery(this, R.string.trabajos_jefe, R.drawable.trabajos_jefe, R.raw.trabajos_jefe)
    }

    fun maestro(view: View?) {
        gallery(
            this,
            R.string.trabajos_maestro,
            R.drawable.trabajos_maestro,
            R.raw.trabajos_maestro
        )
    }

    fun pastor(view: View?) {
        gallery(this, R.string.trabajos_pastor, R.drawable.trabajos_pastor, R.raw.trabajos_pastor)
    }

    fun periodista(view: View?) {
        gallery(
            this,
            R.string.trabajos_periodista,
            R.drawable.trabajos_periodista,
            R.raw.trabajos_periodista
        )
    }

    fun policia(view: View?) {
        gallery(
            this,
            R.string.trabajos_policia,
            R.drawable.trabajos_policia,
            R.raw.trabajos_policia
        )
    }

    fun profesor(view: View?) {
        gallery(
            this,
            R.string.trabajos_profesor,
            R.drawable.trabajos_profesor,
            R.raw.trabajos_profesor
        )
    }

    fun sacerdote(view: View?) {
        gallery(
            this,
            R.string.trabajos_sacerdote,
            R.drawable.trabajos_sacerdote,
            R.raw.trabajos_sacerdote
        )
    }
}