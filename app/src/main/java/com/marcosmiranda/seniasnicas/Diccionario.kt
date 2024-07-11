package com.marcosmiranda.seniasnicas

import android.app.Activity
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Resources.Theme
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import androidx.core.view.marginBottom
import androidx.room.Room

class Diccionario : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diccionario)

        val tlCategorias = findViewById<TableLayout>(R.id.activity_diccionario_tl_categorias)

        val btnLayoutParams = TableRow.LayoutParams(
            450,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        btnLayoutParams.setMargins(32, 32, 32, 32)
        val trLayoutParams = TableRow.LayoutParams()
        trLayoutParams.setMargins(0, 32, 0, 32)

        val db = Room.databaseBuilder(applicationContext, Database::class.java, "SeniasNicas")
            .createFromAsset("databases/SeniasNicas.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        val categoriaDao = db.categoriaDao()
        val categorias = categoriaDao.getAll()
        // Log.e("categorias", categorias.toString())

        val categoriasPerRow = 2
        var c = 0
        var row = TableRow(applicationContext)
        categorias.forEach { ctg ->
            // Log.e("categoria", ctg.toString())
            val ctgId = ctg.id
            val ctgNombre = ctg.nombre

            val ctgHasPalabras = db.palabraDao().getByCategoria(ctgId).isNotEmpty()
            if (!ctgHasPalabras) return@forEach

            val btnIconId: Int
            val btnColorId: Int
            when (ctgId) {
                1 -> {
                    // Anatomía
                    btnIconId = R.drawable.person_icon
                    btnColorId = R.drawable.tan_button
                }
                2 -> {
                    // Animales
                    btnIconId = R.drawable.paw_icon
                    btnColorId = R.drawable.brown_button
                }
                3 -> {
                    // Colores
                    btnIconId = R.drawable.palette_icon
                    btnColorId = R.drawable.rgb_button
                }
                4 -> {
                    // Comida
                    btnIconId = R.drawable.utensils_icon
                    btnColorId = R.drawable.olive_button
                }
                // 5 -> {
                //     // Cristianismo
                //     btnIconId = R.drawable.cross_icon
                //     btnColorId = R.drawable.white_button
                // }
                6 -> {
                    // Deportes
                    btnIconId = R.drawable.soccer_icon
                    btnColorId = R.drawable.tan_button
                }
                7 -> {
                    // Direcciones
                    btnIconId = R.drawable.compass_icon
                    btnColorId = R.drawable.white_button
                }
                8 -> {
                    // Emergencias
                    btnIconId = R.drawable.truck_medical_icon
                    btnColorId = R.drawable.red_button
                }
                9 -> {
                    // Familia
                    btnIconId = R.drawable.people_roof_icon
                    btnColorId = R.drawable.pink_button
                }
                10 -> {
                    // Geografía
                    btnIconId = R.drawable.earth_icon
                    btnColorId = R.drawable.green_button
                }
                // 11 -> {
                //     // Herramientas
                //     btnIconId = R.drawable.sign_language_icon
                //     btnColorId = R.drawable.tan_button
                // }
                // 12 -> {
                //     // Lugares
                //     btnIconId = R.drawable.sign_language_icon
                //     btnColorId = R.drawable.tan_button
                // }
                13 -> {
                    // Números
                    btnIconId = R.drawable.numbers_icon
                    btnColorId = R.drawable.purple_button
                }
                14 -> {
                    // Ropa
                    btnIconId = R.drawable.shirt_icon
                    btnColorId = R.drawable.magenta_button
                }
                15 -> {
                    // Saludos
                    btnIconId = R.drawable.handshake_icon
                    btnColorId = R.drawable.white_button
                }
                16 -> {
                    // Tiempo
                    btnIconId = R.drawable.clock_icon
                    btnColorId = R.drawable.cyan_teal_button
                }
                17 -> {
                    // Trabajos
                    btnIconId = R.drawable.graduation_cap_icon
                    btnColorId = R.drawable.blue_navy_button
                }
                18 -> {
                    // Transporte
                    btnIconId = R.drawable.car_side_icon
                    btnColorId = R.drawable.gray_button
                }
                19 -> {
                    // Verbos
                    btnIconId = R.drawable.bed_icon
                    btnColorId = R.drawable.tan_button
                }
                else -> {
                    btnIconId = 0
                    btnColorId = 0
                }
            }

            val btn = Button(applicationContext)
            btn.text = ctgNombre
            // btn.textSize = R.dimen.btn_text_size.toFloat()
            btn.setTextColor(Color.WHITE)
            btn.setShadowLayer(5f, 0f, 0f, Color.BLACK)
            btn.layoutParams = btnLayoutParams
            btn.setCompoundDrawablesWithIntrinsicBounds(btnIconId, 0, 0, 0)
            btn.setBackgroundResource(btnColorId)
            btn.gravity = Gravity.CENTER
            // btn.setPadding(8, 0, 8, 0)
            btn.setOnClickListener {
                val intent = Intent(this, CategoriaPalabras::class.java)
                intent.putExtra("categoria", ctgId)
                intent.putExtra("icon", btnIconId)
                startActivity(intent)
            }
            row.addView(btn)
            c++

            if (c == categoriasPerRow || ctg == categorias.last()) {
                row.gravity = Gravity.CENTER
                // row.layoutParams = trLayoutParams
                tlCategorias.addView(row)
                row = TableRow(applicationContext)
                c = 0
            }
        }
    }
}