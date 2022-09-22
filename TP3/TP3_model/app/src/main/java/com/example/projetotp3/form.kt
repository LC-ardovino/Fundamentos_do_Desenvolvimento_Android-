package com.example.projetotp3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetotp3.databinding.ActivityFormBinding


class form : AppCompatActivity() {
    private  lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

}


