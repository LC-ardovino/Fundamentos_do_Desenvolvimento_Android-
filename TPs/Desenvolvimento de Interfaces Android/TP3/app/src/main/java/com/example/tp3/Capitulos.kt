package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Capitulos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capitulos)
        val capitulo1 = findViewById<Button>(R.id.capitulo1)
        capitulo1.setOnClickListener{
            val capitulo1Intent = Intent(this,Capitulo1::class.java)
            startActivity(capitulo1Intent)
        }
    }
}