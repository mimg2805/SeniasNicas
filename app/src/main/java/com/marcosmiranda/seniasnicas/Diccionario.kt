package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class Diccionario : Activity() {
    //public static String category;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diccionario)
    }

    fun anatomia(view: View?) {
        val intent = Intent(this, AnatomiaWordList::class.java)
        //category = String.valueOf(R.string.categoria_anatomia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun animales(view: View?) {
        val intent = Intent(this, AnimalesWordList::class.java)
        //category = String.valueOf(R.string.categoria_animales).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun colores(view: View?) {
        val intent = Intent(this, ColoresWordList::class.java)
        //category = String.valueOf(R.string.categoria_colores).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun comida(view: View?) {
        val intent = Intent(this, ComidaWordList::class.java)
        //category = String.valueOf(R.string.categoria_comida).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun direcciones(view: View?) {
        val intent = Intent(this, DireccionesWordList::class.java)
        //category = String.valueOf(R.string.categoria_direcciones).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun emergencias(view: View?) {
        val intent = Intent(this, EmergenciasWordList::class.java)
        //category = String.valueOf(R.string.categoria_emergencias).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun familia(view: View?) {
        val intent = Intent(this, FamiliaWordList::class.java)
        //category = String.valueOf(R.string.categoria_familia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun geografia(view: View?) {
        val intent = Intent(this, GeografiaWordList::class.java)
        //category = String.valueOf(R.string.categoria_geografia).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun numeros(view: View?) {
        val intent = Intent(this, NumerosWordList::class.java)
        //category = String.valueOf(R.string.categoria_numeros).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun ropa(view: View?) {
        val intent = Intent(this, RopaWordList::class.java)
        //category = String.valueOf(R.string.categoria_ropa).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun saludos(view: View?) {
        val intent = Intent(this, SaludosWordList::class.java)
        //category = String.valueOf(R.string.categoria_saludos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun tiempo(view: View?) {
        val intent = Intent(this, TiempoWordList::class.java)
        //category = String.valueOf(R.string.categoria_tiempo).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun trabajos(view: View?) {
        val intent = Intent(this, TrabajosWordList::class.java)
        //category = String.valueOf(R.string.categoria_trabajos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun transporte(view: View?) {
        val intent = Intent(this, TransporteWordList::class.java)
        //category = String.valueOf(R.string.categoria_transporte).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    fun verbos(view: View?) {
        val intent = Intent(this, VerbosWordList::class.java)
        //category = String.valueOf(R.string.categoria_verbos).toUpperCase();
        //intent.putExtra(EXTRA_CATEGORY, category);
        startActivity(intent)
    }

    companion object {
        @JvmField
        val EXTRA_CATEGORY = R.string.extra_category.toString()
    }
}