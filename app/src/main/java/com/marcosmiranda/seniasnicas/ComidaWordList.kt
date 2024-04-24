package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ComidaWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida_word_list)
    }

    fun arroz(view: View?) {
        Helper.gallery(this, R.string.comida_arroz, R.drawable.comida_arroz, R.raw.comida_arroz)
    }

    fun banano(view: View?) {
        Helper.gallery(this, R.string.comida_banano, R.drawable.comida_banano, R.raw.comida_banano)
    }

    fun cafe(view: View?) {
        Helper.gallery(this, R.string.comida_cafe, R.drawable.comida_cafe, R.raw.comida_cafe)
    }

    fun carne(view: View?) {
        Helper.gallery(this, R.string.comida_carne, R.drawable.comida_carne, R.raw.comida_carne)
    }

    fun ensalada(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_ensalada,
            R.drawable.comida_ensalada,
            R.raw.comida_ensalada
        )
    }

    fun frijoles(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_frijoles,
            R.drawable.comida_frijoles,
            R.raw.comida_frijoles
        )
    }

    fun gaseosa(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_gaseosa,
            R.drawable.comida_gaseosa,
            R.raw.comida_gaseosa
        )
    }

    fun hamburguesa(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_hamburguesa,
            R.drawable.comida_hamburguesa,
            R.raw.comida_hamburguesa
        )
    }

    fun helado(view: View?) {
        Helper.gallery(this, R.string.comida_helado, R.drawable.comida_helado, R.raw.comida_helado)
    }

    fun huevo(view: View?) {
        Helper.gallery(this, R.string.comida_huevo, R.drawable.comida_huevo, R.raw.comida_huevo)
    }

    fun leche(view: View?) {
        Helper.gallery(this, R.string.comida_leche, R.drawable.comida_leche, R.raw.comida_leche)
    }

    fun manzana(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_manzana,
            R.drawable.comida_manzana,
            R.raw.comida_manzana
        )
    }

    fun papasfritas(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_papasfritas,
            R.drawable.comida_papasfritas,
            R.raw.comida_papasfritas
        )
    }

    fun pizza(view: View?) {
        Helper.gallery(this, R.string.comida_pizza, R.drawable.comida_pizza, R.raw.comida_pizza)
    }

    fun queso(view: View?) {
        Helper.gallery(this, R.string.comida_queso, R.drawable.comida_queso, R.raw.comida_queso)
    }

    fun salsadetomate(view: View?) {
        Helper.gallery(
            this,
            R.string.comida_salsadetomate,
            R.drawable.comida_salsadetomate,
            R.raw.comida_salsadetomate
        )
    }

    fun sandia(view: View?) {
        Helper.gallery(this, R.string.comida_sandia, R.drawable.comida_sandia, R.raw.comida_sandia)
    }

    fun sopa(view: View?) {
        Helper.gallery(this, R.string.comida_sopa, R.drawable.comida_sopa, R.raw.comida_sopa)
    }
}