package com.example.fragmentview_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)

        val button = findViewById<Button>(R.id.Avancar2)
        button.setOnClickListener{
            val signupIntent = Intent(this,Pagina3::class.java)
            startActivity(signupIntent)
        }

    }
}