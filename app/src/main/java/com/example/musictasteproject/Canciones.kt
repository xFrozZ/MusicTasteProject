package com.example.musictasteproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Canciones : AppCompatActivity()  {
/*
    private lateinit var list: ListView
    private lateinit var search: SearchView
*/
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canciones)
/*
        list = findViewById(R.id.listView)
        search = findViewById(R.id.Search)
*/
        val recycler : RecyclerView = findViewById(R.id.recycler)
        val adapter : RecyclerViewAdapter = RecyclerViewAdapter()
       // val canc = arrayOf("Hey","Si")

        // val adapter: ArrayAdapter<String> = ArrayAdapter(
        //    this,android.R.layout.simple_list_item_1,canc)

        //list.adapter = adapter

        //Configuración del adapter

        adapter.RecyclerViewAdapter(canciones(),this)

        //Configuracion del recycler view
        recycler.hasFixedSize()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
/*
        search.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                search.clearFocus()
                if(canc.contains(p0))
                {
                    adapter.filter.filter(p0)
                }else {
                    Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
                }
                return false
            }


            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.filter.filter(p0)
                return false
            }

        })
        */

    }



    private fun canciones(): MutableList<CancionModel> {
        var cancionesModels : MutableList<CancionModel> = ArrayList()
        cancionesModels.add(CancionModel("Hey brother","Avivii"))
        cancionesModels.add(CancionModel("Si estuviésemos juntos","Bad Bunny"))

        cancionesModels.add(CancionModel("Alone","Alan Walker"))
        cancionesModels.add(CancionModel("SAOKO","Rosalía"))
        cancionesModels.add(CancionModel("Me puse pedo","Sabino"))
        cancionesModels.add(CancionModel("Dinamite","Taio Cruz"))
        cancionesModels.add(CancionModel("Balada","Gusttavo Lima"))
        cancionesModels.add(CancionModel("Experimento","Myke Towers"))
        cancionesModels.add(CancionModel("Todo de ti","Rauw Alejandro"))
        cancionesModels.add(CancionModel("Amarillo","J Balvin"))



        return cancionesModels
    }

}


