package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AnatomiaWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anatomia_word_list)
    }

    fun cuerpo(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_cuerpo,
            R.drawable.anatomia_cuerpo,
            R.raw.anatomia_cuerpo
        )
    }

    fun hombre(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_hombre,
            R.drawable.anatomia_hombre,
            R.raw.anatomia_hombre
        )
    }

    fun mujer(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_mujer,
            R.drawable.anatomia_mujer,
            R.raw.anatomia_mujer
        )
    }

    fun cabeza(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_cabeza,
            R.drawable.anatomia_cabeza,
            R.raw.anatomia_cabeza
        )
    }

    fun cabello(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_cabello,
            R.drawable.anatomia_cabello,
            R.raw.anatomia_cabello
        )
    }

    fun ojos(view: View?) {
        Helper.gallery(this, R.string.anatomia_ojos, R.drawable.anatomia_ojos, R.raw.anatomia_ojos)
    }

    fun nariz(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_nariz,
            R.drawable.anatomia_nariz,
            R.raw.anatomia_nariz
        )
    }

    fun oreja(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_oreja,
            R.drawable.anatomia_oreja,
            R.raw.anatomia_oreja
        )
    }

    fun boca(view: View?) {
        Helper.gallery(this, R.string.anatomia_boca, R.drawable.anatomia_boca, R.raw.anatomia_boca)
    }

    fun pecho(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_pecho,
            R.drawable.anatomia_pecho,
            R.raw.anatomia_pecho
        )
    }

    fun brazo(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_brazo,
            R.drawable.anatomia_brazo,
            R.raw.anatomia_brazo
        )
    }

    fun mano(view: View?) {
        Helper.gallery(this, R.string.anatomia_mano, R.drawable.anatomia_mano, R.raw.anatomia_mano)
    }

    fun estomago(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_estomago,
            R.drawable.anatomia_estomago,
            R.raw.anatomia_estomago
        )
    }

    fun pierna(view: View?) {
        Helper.gallery(
            this,
            R.string.anatomia_pierna,
            R.drawable.anatomia_pierna,
            R.raw.anatomia_pierna
        )
    }

    fun pie(view: View?) {
        Helper.gallery(this, R.string.anatomia_pies, R.drawable.anatomia_pies, R.raw.anatomia_pies)
    }
}