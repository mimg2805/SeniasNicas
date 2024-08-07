package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button

class MainMenu : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnAbecedario = findViewById<Button>(R.id.activity_main_menu_btn_abecedario)
        btnAbecedario.setOnClickListener { startActivity(Intent(this, Abecedario::class.java)) }

        val btnDiccionario = findViewById<Button>(R.id.activity_main_menu_btn_diccionario)
        btnDiccionario.setOnClickListener { startActivity(Intent(this, Diccionario::class.java)) }

        // val btnHistoria = findViewById<Button>(R.id.activity_main_menu_btn_historia)
        // btnHistoria.setOnClickListener { startActivity(Intent(this, Historia::class.java)) }

        val btnJuegos = findViewById<Button>(R.id.activity_main_menu_btn_juegos)
        btnJuegos.setOnClickListener { startActivity(Intent(this, Juegos::class.java)) }

        val btnMasApps = findViewById<Button>(R.id.activity_main_menu_btn_mas_apps)
        btnMasApps.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.developer_url)))) }

        val btnExit = findViewById<Button>(R.id.activity_main_menu_btn_exit)
        btnExit.setOnClickListener { finish() }
    }

    override fun onDestroy() {
        applicationContext.cacheDir.deleteRecursively()
        super.onDestroy()
    }
}