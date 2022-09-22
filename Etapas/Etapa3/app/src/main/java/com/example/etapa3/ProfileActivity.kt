package com.example.etapa3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nome_textview = findViewById<TextInputEditText>(R.id.nome_TextInputEditText)

        val cidade_textview = findViewById<TextInputEditText>(R.id.cidade_TextInputEditText)
        val status_textview = findViewById<TextInputEditText>(R.id.status_TextInputEditText)

        val idade_acty = findViewById<TextInputEditText>(R.id.idade2_TextInputEditText)

        val nome = intent.getStringExtra(NOME_EXTRA)
        val cidade = intent.getStringExtra(CIDADE_EXTRA)

        val idade = intent.getStringExtra(IDADE)


        nome_textview.setText(nome)

        cidade_textview.setText(cidade)
        idade_acty.setText(idade)

        val voto = when(deveVotar(idade!!.toInt())){
            FACULTATIVO ->"Seu voto será FACULTATIVO na próxima eleição"
            OBRIGATORIO ->"Seu voto será OBRIGATÓRIO na próxima eleição"
            else -> "Menor de 16? Como veio parar aqui?"
        }
        status_textview.setText(voto)

    }
}