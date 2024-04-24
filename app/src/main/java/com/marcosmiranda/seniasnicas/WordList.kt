package com.marcosmiranda.seniasnicas

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WordList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_list)
        val intent = intent
        val message = intent.getStringExtra(Diccionario.EXTRA_CATEGORY)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}
