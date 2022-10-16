package com.example.aula06exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.aula06exercicios.databinding.ActivityEx3Binding
import org.w3c.dom.Text

class Ex3 : AppCompatActivity() {
    lateinit var binding: ActivityEx3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //spinner do Gênero
        val genero = arrayListOf(getString(R.string.spinner), getString(R.string.spinnerAcao),
            getString(R.string.spinnerEsporte), getString(R.string.spinnerAventura)) //Opções do spinner
        val adapterGenero = ArrayAdapter(this,android.R.layout.simple_spinner_item,genero) //preenchendo spinner com o Array
        adapterGenero.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) //deixando spinner clicavel como dropDown
        binding.spinnerGenero.adapter = adapterGenero //Ativa spinner com as opcoes

        //spinner PlataformaEscolha plataforma
        val plataforma = arrayListOf(getString(R.string.spinPlataforma), getString(R.string.spinPlatPc),
            getString(R.string.spinPlatPlaystaition), getString(R.string.spinPlatXbox),getString(R.string.spinPlatMultiplataforma))//Opções do spinner
        val adapterPlataforma = ArrayAdapter(this, android.R.layout.simple_spinner_item,plataforma)//preenchendo spinner com o Array
        adapterPlataforma.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) //deixando spinner clicavel como dropDown
        binding.spinnerPlataforma.adapter = adapterPlataforma //Ativa spinner com as opcoes


        binding.buttonConfirmacao.setOnClickListener {
            alert("Resultados escolhidos: ${binding.editTextJogo.text}, a plataforma é ${binding.spinnerPlataforma.selectedItem}, o gênero é: ${binding.spinnerGenero.selectedItem}")
        }
    }

    fun alert(jogo: String){
        AlertDialog.Builder(this)
            .setTitle("Resultado")
            .setMessage(jogo)
            .setPositiveButton("Ok", null)
            .create()
            .show()


    }
}