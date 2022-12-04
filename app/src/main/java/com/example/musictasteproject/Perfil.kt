package com.example.musictasteproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perfil : AppCompatActivity() {
    private lateinit var btnSalir: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil2)

        btnSalir = findViewById(R.id.btnSalirPerfil)

        btnSalir.setOnClickListener {
            val intent = Intent(this, Canciones::class.java)
            startActivity(intent)
        }
    }



}