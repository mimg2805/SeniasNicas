package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class TransporteWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transporte_word_list)
    }

    fun avion(view: View?) {
        gallery(
            this,
            R.string.transporte_avion,
            R.drawable.transporte_avion,
            R.raw.transporte_avion
        )
    }

    fun bus(view: View?) {
        gallery(this, R.string.transporte_bus, R.drawable.transporte_bus, R.raw.transporte_bus)
    }

    fun carro(view: View?) {
        gallery(
            this,
            R.string.transporte_carro,
            R.drawable.transporte_carro,
            R.raw.transporte_carro
        )
    }

    fun camion(view: View?) {
        gallery(
            this,
            R.string.transporte_camion,
            R.drawable.transporte_camion,
            R.raw.transporte_camion
        )
    }

    fun carretilla(view: View?) {
        gallery(
            this,
            R.string.transporte_carretilla,
            R.drawable.transporte_carretilla,
            R.raw.transporte_carretilla
        )
    }

    fun helicoptero(view: View?) {
        gallery(
            this,
            R.string.transporte_helicoptero,
            R.drawable.transporte_helicoptero,
            R.raw.transporte_helicoptero
        )
    }

    fun microbus(view: View?) {
        gallery(
            this,
            R.string.transporte_microbus,
            R.drawable.transporte_microbus,
            R.raw.transporte_microbus
        )
    }

    fun moto(view: View?) {
        gallery(this, R.string.transporte_moto, R.drawable.transporte_moto, R.raw.transporte_moto)
    }

    fun taxi(view: View?) {
        gallery(this, R.string.transporte_taxi, R.drawable.transporte_taxi, R.raw.transporte_taxi)
    }

    fun tren(view: View?) {
        gallery(this, R.string.transporte_tren, R.drawable.transporte_tren, R.raw.transporte_tren)
    }
}