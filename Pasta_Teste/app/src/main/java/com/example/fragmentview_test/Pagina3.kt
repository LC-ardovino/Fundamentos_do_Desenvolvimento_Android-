package com.example.fragmentview_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentview_test.ui.main.MainFragment

class Pagina3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}