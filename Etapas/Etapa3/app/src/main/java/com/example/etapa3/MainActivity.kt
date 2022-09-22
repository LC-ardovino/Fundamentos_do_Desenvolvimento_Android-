package com.example.etapa3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val avancar_button = findViewById<Button>(R.id.avancar_button)
        val idade_edittext = findViewById<TextInputEditText>(R.id.idade_textInputEditText)

        avancar_button.setOnClickListener {
            //recebe a idade como uma String (texto)
            val idade = idade_edittext.text.toString()
            // passa a idade convertida para inteiro
            val status = deveVotar(idade.toInt())

            // verifica a situação eleitoral do usuário e responde
            if (status == PROIBIDO){
                Toast.makeText(this,
                    "Você NÃO PODE usar este APP ainda!",
                    Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Vamos prosseguir com o seu perfil!", Toast.LENGTH_LONG).show()
                val signupIntent = Intent(this,CadastroActivity::class.java)

                signupIntent.putExtra(IDADE,idade)
                startActivity(signupIntent)

            }

        }


   }
}


