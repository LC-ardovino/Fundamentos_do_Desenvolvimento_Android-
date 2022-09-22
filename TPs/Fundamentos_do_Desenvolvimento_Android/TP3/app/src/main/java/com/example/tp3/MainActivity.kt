package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Iniciar = findViewById<Button>(R.id.Iniciar_teste)

        Iniciar.setOnClickListener {
            // Respond to button press
            //val signupIntent = Intent(this,NomeDaActivity::class.java)
            //startActivity(signupIntent)
        }
    }
}