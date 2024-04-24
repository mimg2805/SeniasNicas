package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class NumerosWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numeros_word_list)
    }

    fun cero(view: View?) {
        gallery(this, R.string.num_0, R.drawable.numeros_0, R.raw.numeros_0)
    }

    fun uno(view: View?) {
        gallery(this, R.string.num_1, R.drawable.numeros_01, R.raw.numeros_01)
    }

    fun dos(view: View?) {
        gallery(this, R.string.num_2, R.drawable.numeros_02, R.raw.numeros_02)
    }

    fun tres(view: View?) {
        gallery(this, R.string.num_3, R.drawable.numeros_03, R.raw.numeros_03)
    }

    fun cuatro(view: View?) {
        gallery(this, R.string.num_4, R.drawable.numeros_04, R.raw.numeros_04)
    }

    fun cinco(view: View?) {
        gallery(this, R.string.num_5, R.drawable.numeros_05, R.raw.numeros_05)
    }

    fun seis(view: View?) {
        gallery(this, R.string.num_6, R.drawable.numeros_06, R.raw.numeros_06)
    }

    fun siete(view: View?) {
        gallery(this, R.string.num_7, R.drawable.numeros_07, R.raw.numeros_07)
    }

    fun ocho(view: View?) {
        gallery(this, R.string.num_8, R.drawable.numeros_08, R.raw.numeros_08)
    }

    fun nueve(view: View?) {
        gallery(this, R.string.num_9, R.drawable.numeros_09, R.raw.numeros_09)
    }

    fun diez(view: View?) {
        gallery(this, R.string.num_10, R.drawable.numeros_10, R.raw.numeros_10)
    }

    fun once(view: View?) {
        gallery(this, R.string.num_11, R.drawable.numeros_11, R.raw.numeros_11)
    }

    fun doce(view: View?) {
        gallery(this, R.string.num_12, R.drawable.numeros_12, R.raw.numeros_12)
    }

    fun trece(view: View?) {
        gallery(this, R.string.num_13, R.drawable.numeros_13, R.raw.numeros_13)
    }

    fun catorce(view: View?) {
        gallery(this, R.string.num_14, R.drawable.numeros_14, R.raw.numeros_14)
    }

    fun quince(view: View?) {
        gallery(this, R.string.num_15, R.drawable.numeros_15, R.raw.numeros_15)
    }

    fun dieciseis(view: View?) {
        gallery(this, R.string.num_16, R.drawable.numeros_16, R.raw.numeros_16)
    }

    fun diecisiete(view: View?) {
        gallery(this, R.string.num_17, R.drawable.numeros_17, R.raw.numeros_17)
    }

    fun dieciocho(view: View?) {
        gallery(this, R.string.num_18, R.drawable.numeros_18, R.raw.numeros_18)
    }

    fun diecinueve(view: View?) {
        gallery(this, R.string.num_19, R.drawable.numeros_19, R.raw.numeros_19)
    }

    fun veinte(view: View?) {
        gallery(this, R.string.num_20, R.drawable.numeros_20, R.raw.numeros_20)
    }

    fun treinta(view: View?) {
        gallery(this, R.string.num_30, R.drawable.numeros_30, R.raw.numeros_30)
    }

    fun cuarenta(view: View?) {
        gallery(this, R.string.num_40, R.drawable.numeros_40, R.raw.numeros_40)
    }

    fun cincuenta(view: View?) {
        gallery(this, R.string.num_50, R.drawable.numeros_50, R.raw.numeros_50)
    }

    fun sesenta(view: View?) {
        gallery(this, R.string.num_60, R.drawable.numeros_60, R.raw.numeros_60)
    }

    fun setenta(view: View?) {
        gallery(this, R.string.num_70, R.drawable.numeros_70, R.raw.numeros_70)
    }

    fun ochenta(view: View?) {
        gallery(this, R.string.num_80, R.drawable.numeros_80, R.raw.numeros_80)
    }

    fun noventa(view: View?) {
        gallery(this, R.string.num_90, R.drawable.numeros_90, R.raw.numeros_90)
    }

    fun cien(view: View?) {
        gallery(this, R.string.num_100, R.drawable.numeros_100, R.raw.numeros_100)
    }

    fun quinientos(view: View?) {
        gallery(this, R.string.num_500, R.drawable.numeros_500, R.raw.numeros_500)
    }

    fun mil(view: View?) {
        gallery(this, R.string.num_1000, R.drawable.numeros_1000, R.raw.numeros_1000)
    }

    fun millon(view: View?) {
        gallery(this, R.string.num_1000000, R.drawable.numeros_1000000, R.raw.numeros_1000000)
    }
}