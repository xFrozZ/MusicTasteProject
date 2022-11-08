package com.example.musictasteproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var canciones : MutableList<CancionModel> = ArrayList()
    lateinit var context : Context
    fun RecyclerViewAdapter(canciones:MutableList<CancionModel>,context:Context){
        this.canciones = canciones
        this.context = context
    }


    class ViewHolder (view : View):RecyclerView.ViewHolder(view) {
        val nombre: TextView
        val autor : TextView

        init {
            nombre = view.findViewById(R.id.tv_nombre)
            autor = view.findViewById(R.id.tv_autor)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = canciones[position].nombre
        holder.autor.text = canciones[position].autor
    }

    override fun getItemCount() = canciones.size

    }