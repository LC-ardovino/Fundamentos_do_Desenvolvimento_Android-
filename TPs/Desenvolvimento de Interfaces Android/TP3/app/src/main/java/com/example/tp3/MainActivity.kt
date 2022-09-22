package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menu = findViewById<Button>(R.id.Avancar)
        val devs = findViewById<Button>(R.id.Desenvolvedores)
        menu.setOnClickListener{
            val signupIntent = Intent(this,Capitulos::class.java)
            startActivity(signupIntent)
        }
        devs.setOnClickListener{
            val signupIntentDevs = Intent(this,Desenvolvedores::class.java)
            startActivity(signupIntentDevs)
        }
    }
}