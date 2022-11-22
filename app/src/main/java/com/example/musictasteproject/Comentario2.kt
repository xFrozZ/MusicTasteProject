package com.example.musictasteproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Comentario2 : AppCompatActivity() {
    private lateinit var btnEnviar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentario2)



        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
                val intent = Intent(this, Canciones::class.java)
                startActivity(intent)
            }


    }
}