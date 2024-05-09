package com.marcosmiranda.seniasnicas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MasApps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mas_apps)
        val cursoestadisticabasicaLayout =
            findViewById<ConstraintLayout>(R.id.cursoestadisticabasicaLayout)
        cursoestadisticabasicaLayout.setOnClickListener { view: View? ->
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.marcosmiranda.cursoestadisticabasica")
                )
            )
        }
        val nicaroadrageLayout = findViewById<ConstraintLayout>(R.id.nicaroadrageLayout)
        nicaroadrageLayout.setOnClickListener { view: View? ->
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.marcosmiranda.nicaroadrage")
                )
            )
        }
        val purisimaLayout = findViewById<ConstraintLayout>(R.id.purisimaLayout)
        purisimaLayout.setOnClickListener { view: View? ->
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.marcosmiranda.purisima")
                )
            )
        }
    }
}
