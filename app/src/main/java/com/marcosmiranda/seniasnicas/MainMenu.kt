package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainMenu : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val abcBtn = findViewById<Button>(R.id.abcBtn)
        abcBtn.setOnClickListener { startActivity(Intent(this, Letras::class.java)) }

        val dicBtn = findViewById<Button>(R.id.dicBtn)
        dicBtn.setOnClickListener { startActivity(Intent(this, Diccionario::class.java)) }

        val masAppsBtn = findViewById<Button>(R.id.masAppsBtn)
        masAppsBtn.setOnClickListener { startActivity(Intent(this, MasApps::class.java)) }

        val exitBtn = findViewById<Button>(R.id.exitBtn)
        exitBtn.setOnClickListener { finish() }
    }
}