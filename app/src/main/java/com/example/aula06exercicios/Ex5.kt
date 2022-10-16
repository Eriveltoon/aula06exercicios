package com.example.aula06exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.aula06exercicios.databinding.ActivityEx5Binding

class Ex5 : AppCompatActivity() {
    lateinit var binding: ActivityEx5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val genero = arrayListOf("Escolha uma opção", "Filme", "Música", "Livro", "Jogo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genero)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerGenero2.adapter = adapter

        val opcaoEscolhida = arrayListOf("")

    }
}