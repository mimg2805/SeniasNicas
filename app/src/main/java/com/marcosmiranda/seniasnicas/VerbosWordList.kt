package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marcosmiranda.seniasnicas.Helper.gallery

class VerbosWordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verbos_word_list)
    }

    fun amar(view: View?) {
        gallery(this, R.string.verbos_amar, R.drawable.verbos_amar, R.raw.verbos_amar)
    }

    fun aprender(view: View?) {
        gallery(this, R.string.verbos_aprender, R.drawable.verbos_aprender, R.raw.verbos_aprender)
    }

    fun baniar(view: View?) {
        gallery(this, R.string.verbos_bañar, R.drawable.verbos_baniar, R.raw.verbos_baniar)
    }

    fun beber(view: View?) {
        gallery(this, R.string.verbos_beber, R.drawable.verbos_beber, R.raw.verbos_beber)
    }

    fun caminar(view: View?) {
        gallery(this, R.string.verbos_caminar, R.drawable.verbos_caminar, R.raw.verbos_caminar)
    }

    fun cantar(view: View?) {
        gallery(this, R.string.verbos_cantar, R.drawable.verbos_cantar, R.raw.verbos_cantar)
    }

    fun comer(view: View?) {
        gallery(this, R.string.verbos_comer, R.drawable.verbos_comer, R.raw.verbos_comer)
    }

    fun comprar(view: View?) {
        gallery(this, R.string.verbos_comprar, R.drawable.verbos_comprar, R.raw.verbos_comprar)
    }

    fun dormir(view: View?) {
        gallery(this, R.string.verbos_dormir, R.drawable.verbos_dormir, R.raw.verbos_dormir)
    }

    fun enseniar(view: View?) {
        gallery(this, R.string.verbos_enseñar, R.drawable.verbos_enseniar, R.raw.verbos_enseniar)
    }

    fun escribir(view: View?) {
        gallery(this, R.string.verbos_escribir, R.drawable.verbos_escribir, R.raw.verbos_escribir)
    }

    fun escuchar(view: View?) {
        gallery(this, R.string.verbos_escuchar, R.drawable.verbos_escuchar, R.raw.verbos_escuchar)
    }

    fun estudiar(view: View?) {
        gallery(this, R.string.verbos_estudiar, R.drawable.verbos_estudiar, R.raw.verbos_estudiar)
    }

    fun gritar(view: View?) {
        gallery(this, R.string.verbos_gritar, R.drawable.verbos_gritar, R.raw.verbos_gritar)
    }

    fun hacer(view: View?) {
        gallery(this, R.string.verbos_hacer, R.drawable.verbos_hacer, R.raw.verbos_hacer)
    }

    fun leer(view: View?) {
        gallery(this, R.string.verbos_leer, R.drawable.verbos_leer, R.raw.verbos_leer)
    }

    fun llamar(view: View?) {
        gallery(this, R.string.verbos_llamar, R.drawable.verbos_llamar, R.raw.verbos_llamar)
    }

    fun trabajar(view: View?) {
        gallery(this, R.string.verbos_trabajar, R.drawable.verbos_trabajar, R.raw.verbos_trabajar)
    }

    fun ver(view: View?) {
        gallery(this, R.string.verbos_ver, R.drawable.verbos_ver, R.raw.verbos_ver)
    }

    fun vender(view: View?) {
        gallery(this, R.string.verbos_vender, R.drawable.verbos_vender, R.raw.verbos_vender)
    }
}