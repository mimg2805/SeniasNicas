package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class TiempoWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiempo_word_list)
    }

    fun hoy(view: View?) {
        gallery(this, R.string.tiempo_hoy, R.drawable.tiempo_hoy, R.raw.tiempo_hoy)
    }

    fun maniana(view: View?) {
        gallery(this, R.string.tiempo_mañana, R.drawable.tiempo_maniana, R.raw.tiempo_maniana)
    }

    fun ayer(view: View?) {
        gallery(this, R.string.tiempo_ayer, R.drawable.tiempo_ayer, R.raw.tiempo_ayer)
    }

    fun segundo(view: View?) {
        gallery(this, R.string.tiempo_segundo, R.drawable.tiempo_segundo, R.raw.tiempo_segundo)
    }

    fun minuto(view: View?) {
        gallery(this, R.string.tiempo_minuto, R.drawable.tiempo_minuto, R.raw.tiempo_minuto)
    }

    fun hora(view: View?) {
        gallery(this, R.string.tiempo_hora, R.drawable.tiempo_hora, R.raw.tiempo_hora)
    }

    fun dia(view: View?) {
        gallery(this, R.string.tiempo_dia, R.drawable.tiempo_dia, R.raw.tiempo_dia)
    }

    fun semana(view: View?) {
        gallery(this, R.string.tiempo_semana, R.drawable.tiempo_semana, R.raw.tiempo_semana)
    }

    fun mes(view: View?) {
        gallery(this, R.string.tiempo_mes, R.drawable.tiempo_mes, R.raw.tiempo_mes)
    }

    fun anio(view: View?) {
        gallery(this, R.string.tiempo_año, R.drawable.tiempo_anio, R.raw.tiempo_anio)
    }

    fun quehoraes(view: View?) {
        gallery(
            this,
            R.string.tiempo_quehoraes,
            R.drawable.tiempo_quehoraes,
            R.raw.tiempo_quehoraes
        )
    }
}