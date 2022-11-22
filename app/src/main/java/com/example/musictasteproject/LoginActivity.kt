package com.example.musictasteproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var btnlogin: Button
    private lateinit var btnReg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        btnlogin = findViewById(R.id.button)

        btnlogin.setOnClickListener {
                val intent = Intent(this, Canciones::class.java)
                startActivity(intent)
            }







        btnReg = findViewById(R.id.button2)

        btnReg.setOnClickListener {
                val intent = Intent(this, Registro::class.java)
                startActivity(intent)
            }


    }
}