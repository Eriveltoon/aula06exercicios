package com.example.aula06exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.aula06exercicios.databinding.ActivityEx6Binding

class Ex6 : AppCompatActivity() {
    lateinit var binding: ActivityEx6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx6Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonSomar.setOnClickListener {
            val valor1 = binding.editTextValor1.text.toString().toInt()
            val valor2 = binding.editTextValor2.text.toString().toInt()

//            if(binding.editTextValor1.text.isEmpty() || binding.editTextValor2.text.isEmpty()){
//                alert("Preencha todos os campos")
//            }
            somar(valor1,valor2)
        }

        binding.buttonSubtrair.setOnClickListener {
            val valor1 = binding.editTextValor1.text.toString().toInt()
            val valor2 = binding.editTextValor2.text.toString().toInt()

//            if(binding.editTextValor1.text.isEmpty() || binding.editTextValor2.text.isEmpty()){
//                alert("Preencha todos os campos")
//            }
            subtrair(valor1,valor2)
        }

        binding.buttonMultiplicar.setOnClickListener {
            val valor1 = binding.editTextValor1.text.toString().toInt()
            val valor2 = binding.editTextValor2.text.toString().toInt()

//            if(binding.editTextValor1.text.isEmpty() || binding.editTextValor2.text.isEmpty()){
//                alert("Preencha todos os campos")
//            }
            multiplicar(valor1,valor2)
        }

        binding.buttonDividir.setOnClickListener {
            val valor1 = binding.editTextValor1.text.toString().toInt()
            val valor2 = binding.editTextValor2.text.toString().toInt()

//            if(binding.editTextValor1.text.isEmpty() || binding.editTextValor2.text.isEmpty()){
//                alert("Preencha todos os campos")
//            }
            dividir(valor1,valor2)
        }

    }

    fun alert(msg:String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("Ok",null)
            .setTitle("Erro")
            .create()
            .show()
    }

    fun somar(valor1:Int, valor2:Int){
        val resultado = valor1 + valor2
        binding.textViewResultado.text = resultado.toString()
    }

    fun subtrair(valor1:Int, valor2:Int){
        val resultado = valor1 - valor2
        binding.textViewResultado.text = resultado.toString()
    }

    fun multiplicar(valor1:Int, valor2:Int){
        val resultado = valor1 * valor2
        binding.textViewResultado.text = resultado.toString()
    }

    fun dividir(valor1:Int, valor2:Int){
        val resultado = valor1 / valor2
        binding.textViewResultado.text = resultado.toString()
    }
}