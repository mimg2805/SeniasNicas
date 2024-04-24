package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class GeografiaWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geografia_word_list)
    }

    fun belice(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_belice,
            R.drawable.geografia_belice,
            R.raw.geografia_belice
        )
    }

    fun centroamerica(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_centroamerica,
            R.drawable.geografia_centroamerica,
            R.raw.geografia_centroamerica
        )
    }

    fun costarica(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_costarica,
            R.drawable.geografia_costarica,
            R.raw.geografia_costarica
        )
    }

    fun cuba(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_cuba,
            R.drawable.geografia_cuba,
            R.raw.geografia_cuba
        )
    }

    fun elsalvador(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_elsalvador,
            R.drawable.geografia_elsalvador,
            R.raw.geografia_elsalvador
        )
    }

    fun eeuu(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_eeuu,
            R.drawable.geografia_eeuu,
            R.raw.geografia_eeuu
        )
    }

    fun guatemala(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_guatemala,
            R.drawable.geografia_guatemala,
            R.raw.geografia_guatemala
        )
    }

    fun honduras(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_honduras,
            R.drawable.geografia_honduras,
            R.raw.geografia_honduras
        )
    }

    fun nicaragua(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_nicaragua,
            R.drawable.geografia_nicaragua,
            R.raw.geografia_nicaragua
        )
    }

    fun panama(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_panama,
            R.drawable.geografia_panama,
            R.raw.geografia_panama
        )
    }

    fun repdom(view: View?) {
        Helper.gallery(
            this,
            R.string.geografia_repdom,
            R.drawable.geografia_repdom,
            R.raw.geografia_repdom
        )
    }
}