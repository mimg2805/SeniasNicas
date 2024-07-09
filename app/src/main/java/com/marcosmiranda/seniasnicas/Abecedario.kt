package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import androidx.room.Room

class Abecedario : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abecedario)

        val db = Room.databaseBuilder(applicationContext, Database::class.java, "SeniasNicas")
            .createFromAsset("databases/SeniasNicas.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
        val letras = db.letraDao().getAll()

        val tlLetras = findViewById<TableLayout>(R.id.activity_abecedario_tl_letras)

        val btnMarginX = 32
        val btnMarginY = 96
        val trParams = TableRow.LayoutParams()
        trParams.setMargins(btnMarginX, btnMarginY, btnMarginX, btnMarginY)

        val letrasPerRow = 5
        var letraRowIndex = 0
        var row = TableRow(applicationContext)
        letras.forEach { ltr ->
            val ltrId = ltr.id
            val ltrTxt = ltr.texto

            val btn = Button(applicationContext, null, 0, com.google.android.material.R.style.Base_Widget_AppCompat_Button_Small)
            btn.text = ltrTxt
            btn.setTextColor(Color.WHITE)
            btn.setShadowLayer(5f, 0f, 0f, Color.BLACK)
            btn.setBackgroundResource(R.drawable.gray_button)
            btn.setOnClickListener {
                val intent = Intent(this, Galeria::class.java)
                intent.putExtra("letra", ltrId)
                startActivity(intent)
            }
            row.addView(btn, trParams)
            letraRowIndex++

            if (letraRowIndex == letrasPerRow || ltr == letras.last()) {
                row.gravity = Gravity.CENTER
                tlLetras.addView(row)
                row = TableRow(applicationContext)
                letraRowIndex = 0
            }
        }
    }
}