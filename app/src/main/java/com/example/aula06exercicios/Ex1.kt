package com.example.aula06exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Ex1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val imageViewNike : ImageView = findViewById(R.id.imageViewNike)
        val imageViewAdidas : ImageView = findViewById(R.id.imageViewAdidas)
        val imageViewPuma : ImageView = findViewById(R.id.imageViewPuma)
        val textViewDescricao : TextView = findViewById(R.id.textViewDescricao)


        imageViewNike.setOnClickListener {
            textViewDescricao.text = getString(R.string.nike)
        }

        imageViewAdidas.setOnClickListener {
            textViewDescricao.text = getString(R.string.adidas)
        }

        imageViewPuma.setOnClickListener {
            textViewDescricao.text = getString(R.string.puma)
        }
    }
}