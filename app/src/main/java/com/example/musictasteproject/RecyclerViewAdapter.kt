package com.example.musictasteproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(displayList: ArrayList<CancionModel>, canciones: Canciones) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
    {

    var canciones : MutableList<CancionModel> = ArrayList()
    lateinit var context : Context
    fun RecyclerViewAdapter(canciones:MutableList<CancionModel>,context:Context){
        this.canciones = canciones
        this.context = context
    }


    class ViewHolder (view : View):RecyclerView.ViewHolder(view) {

        val usuario: TextView
        val username : TextView
        val nombre: TextView
        val autor : TextView
        val imagen: ImageView
        val rating: TextView
        val comentario : TextView
        val link: TextView


        init {
            usuario = view.findViewById(R.id.tv_usuario)
            username = view.findViewById(R.id.tv_username)
            nombre = view.findViewById(R.id.tv_cancion)
            autor = view.findViewById(R.id.tv_autor)
            imagen = view.findViewById(R.id.imagenCancion)
            rating = view.findViewById(R.id.tv_rating)
            comentario = view.findViewById(R.id.tv_comentario)
            link = view.findViewById(R.id.tv_link)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text = canciones[position].nombre
        holder.autor.text = canciones[position].autor
        holder.usuario.text = canciones[position].usuario
        holder.username.text = canciones[position].username
        holder.rating.text = canciones[position].rating
        holder.comentario.text = canciones[position].comentario
        holder.link.text = canciones[position].link




    }

    override fun getItemCount() = canciones.size

    

}