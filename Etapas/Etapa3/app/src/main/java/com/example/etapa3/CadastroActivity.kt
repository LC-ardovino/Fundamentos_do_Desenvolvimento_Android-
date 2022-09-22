package com.example.etapa3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val cadastrar_button = findViewById<Button>(R.id.cadastrar_buttonn)

        val nome_edittext = findViewById<TextInputEditText>(R.id.nome_edittext)

        val cidade_edittext = findViewById<TextInputEditText>(R.id.cidade_edittext)
        val idade_edittext = findViewById<TextInputEditText>(R.id.idade_TextInputEditText)

        val idade_cadastro = intent.getStringExtra(IDADE)
        idade_edittext.setText(idade_cadastro)



        cadastrar_button.setOnClickListener{
            val idade = idade_edittext.text.toString()

            val nome = nome_edittext.text.toString()
            val cidade = cidade_edittext.text.toString()

            val profileIntent = Intent(this, ProfileActivity::class.java)

            profileIntent.putExtra(NOME_EXTRA, nome)
            profileIntent.putExtra(CIDADE_EXTRA, cidade)
            profileIntent.putExtra(IDADE,idade)

            startActivity(profileIntent)
        }
    }
}