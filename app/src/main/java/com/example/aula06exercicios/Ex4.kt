package com.example.aula06exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.aula06exercicios.databinding.ActivityEx4Binding

class Ex4 : AppCompatActivity() {
    lateinit var binding: ActivityEx4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirmar.setOnClickListener {
            val msg ="""${getString(R.string.email)}: ${binding.editTextEmail.text}
                |${getString(R.string.telefone)}: ${binding.editTextTelefone.text}
                |${getString(R.string.contato_email)} ${if (binding.checkBoxEmail.isChecked) getString(R.string.sim) else getString(R.string.nao)}
                |${getString(R.string.contato_tel)} ${if (binding.checkBoxTelefone.isChecked) getString(R.string.sim) else getString(R.string.nao)}
            """.trimMargin()

            alert(msg)
        }

        binding.editTextEmail.isEnabled = binding.checkBoxEmail.isChecked
        binding.editTextTelefone.isEnabled = binding.checkBoxTelefone.isChecked

        binding.checkBoxEmail.setOnCheckedChangeListener { checkbox, marcado ->
            binding.editTextEmail.isEnabled = marcado
        }

        binding.checkBoxTelefone.setOnCheckedChangeListener { checkbox, marcado ->
            binding.editTextTelefone.isEnabled = marcado
        }

    }

    fun alert(msg: String){
        AlertDialog.Builder(this)
            .setTitle("Alerta")
            .setMessage(msg)
            .setPositiveButton("Ok", null)
            .create()
            .show()


    }
}