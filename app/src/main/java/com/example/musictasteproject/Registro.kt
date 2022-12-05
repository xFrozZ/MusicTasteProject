package com.example.musictasteproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Registro : AppCompatActivity() {
    private lateinit var btnCont: Button
    var txtNombre: EditText?=null
    var txtApellidos: EditText?=null
    var txtFecha: EditText?=null
    var txtDireccion: EditText?=null
    var txtEmail: EditText?=null
    var txtPass: EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        txtNombre=findViewById(R.id.EditNombre)
        txtApellidos=findViewById(R.id.EditApellidos)
        txtFecha=findViewById(R.id.EditFecha)
        txtDireccion=findViewById(R.id.EditDireccion)
        txtEmail=findViewById(R.id.EditEmail)
        txtPass=findViewById(R.id.EditPassword)





        btnCont = findViewById(R.id.btnSalir)

        btnCont.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }


    }
    fun clickBtnInsertar(view:View){
        //URL del mysql Insertar Usuario
        val url=""
        val queue=Volley.newRequestQueue(this)
        var resultadoPost = object : StringRequest(Request.Method.POST,url,
        Response.Listener<String> { response ->
            Toast.makeText(this,"Usuario insertado existosamente",Toast.LENGTH_LONG).show()
        },Response.ErrorListener { error ->
                Toast.makeText(this, "Error $error", Toast.LENGTH_LONG).show()
            }){
            override fun getParams(): MutableMap<String, String> {
                val parametros=HashMap<String,String>()
                parametros.put("nombre", txtNombre?.text.toString())
                parametros.put("apellido", txtApellidos?.text.toString())
                parametros.put("fechaNacimiento", txtFecha?.text.toString())
                parametros.put("direccion", txtDireccion?.text.toString())
                parametros.put("email", txtEmail?.text.toString())
                parametros.put("contrasena", txtPass?.text.toString())
                return parametros
            }
        }
    }
}