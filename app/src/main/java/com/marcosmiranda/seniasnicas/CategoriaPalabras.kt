package com.marcosmiranda.seniasnicas

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class CategoriaPalabras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_palabras)

        val ivCategoria = findViewById<ImageView>(R.id.activity_categoria_palabras_iv_categoria)
        val tvCategoria = findViewById<TextView>(R.id.activity_categoria_palabras_tv_categoria)
        val llPalabras = findViewById<LinearLayout>(R.id.activity_categoria_palabras_ll_palabras)
        val llParams = LinearLayout.LayoutParams(
            400,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        llParams.setMargins(0, 0, 0, 48)

        val db = Room.databaseBuilder(applicationContext, Database::class.java, "SeniasNicas")
            .createFromAsset("databases/SeniasNicas.db")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        val categoriaId = intent.getIntExtra("categoria", 0)
        val categoriaIconId = intent.getIntExtra("icon", 0)

        val categoria = db.categoriaDao().get(categoriaId)
        val palabras = db.palabraDao().getByCategoria(categoriaId)
        ivCategoria.setImageResource(categoriaIconId)
        tvCategoria.text = categoria.nombre
        // Log.e("categoria", categoria.toString())

        palabras.forEach { plb ->
            // Log.e("palabra", plb.toString())
            val plbId = plb.id
            val plbTxt = plb.texto

            val btn = Button(applicationContext)
            btn.text = plbTxt
            btn.setTextColor(Color.WHITE)
            btn.setShadowLayer(5f, 0f, 0f, Color.BLACK)
            btn.setBackgroundResource(R.drawable.gray_button)
            btn.setOnClickListener {
                val intent = Intent(this, Galeria::class.java)
                intent.putExtra("palabra", plbId)
                startActivity(intent)
            }
            llPalabras.addView(btn, llParams)
        }
    }
}
