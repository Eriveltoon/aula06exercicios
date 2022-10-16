package com.example.aula06exercicios

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.aula06exercicios.databinding.ActivityEx2Binding

class Ex2 : AppCompatActivity() {

    lateinit var binding: ActivityEx2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEx2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val cores = arrayListOf("Escolha uma cor", "Vermelho", "Verde", "Azul")

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, cores) //preenchendo spinner com o Array
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        binding.spinner.adapter = adapter //Ativa spinner com as opcoes do Array

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapter: AdapterView<*>?, spinner: View?, posicao: Int, id: Long){
                when(posicao){
                    1 -> {
                        binding.root.setBackgroundColor(Color.RED)
                    }
                    2 -> {
                        binding.root.setBackgroundColor(Color.GREEN)
                    }
                    3 -> {
                        binding.root.setBackgroundColor(Color.BLUE)
                    }else -> {
                        binding.root.setBackgroundColor(Color.BLACK)
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

    }
}