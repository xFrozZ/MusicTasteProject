package com.example.musictasteproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*


class Canciones : AppCompatActivity()  {


    val arrayList = ArrayList<CancionModel>()
    val displayList = ArrayList<CancionModel>()
    private lateinit var btnComen: FloatingActionButton
    private lateinit var btnPerf: FloatingActionButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canciones)
        btnComen = findViewById(R.id.btnComentar)

        btnComen.setOnClickListener {
            val intent = Intent(this, Comentario2::class.java)
            startActivity(intent)
        }

        btnPerf = findViewById(R.id.btnPerfil)

        btnPerf.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }



        val adapter : RecyclerViewAdapter = RecyclerViewAdapter(displayList, this)
        val recycler : RecyclerView = findViewById(R.id.recycler)


        arrayList.add(CancionModel("Jose","@jose010699","Hey brother","Avivii","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","8/10","Me encanta","https://www.youtube.com/watch?v=6Cp6mKbRTQY"))
        arrayList.add(CancionModel("Pepe","@pepe010460","Si estuviésemos juntos","Bad Bunny","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","6/10","Tampoco me dice tanto","https://www.youtube.com/watch?v=EB7G3fUUaeA"))
        arrayList.add(CancionModel("Manuel","@manuel060383","Hey brother","Avivii","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","9/10","Mi favorita","https://www.youtube.com/watch?v=6Cp6mKbRTQY"))
        arrayList.add(CancionModel("Ana","@ana072181","Alone","Alan Walker","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","4/10","No me gusto mucho","https://www.youtube.com/watch?v=1-xGerv5FOk"))
        arrayList.add(CancionModel("Maria","@maria052144","SAOKO","Rosalia","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","10/10","La cancion es perfecta","https://www.youtube.com/watch?v=6o7bCAZSxsg"))
        arrayList.add(CancionModel("Alex","@alex062162","Me puse pedo","Sabino","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","5/10","Me parece una cancion muy normal","https://www.youtube.com/watch?v=gklsv2MoNNg"))
        arrayList.add(CancionModel("Lucia","@lucia062162","Dinamite","Taio Cruz","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","8/10","Me encantan las voces","https://www.youtube.com/watch?v=Vysgv7qVYTo"))
        arrayList.add(CancionModel("Juan","@juan026901","Balada","Gusttavo Lima","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","5/10","Me parece una cancion cualquiera","https://www.youtube.com/watch?v=1-xGerv5FOk"))
        arrayList.add(CancionModel("Lucas","@lucas103174","Experimento","Myke Towers","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","8/10","La banda sonora me gusta mucho","https://www.youtube.com/watch?v=6o7bCAZSxsg"))
        arrayList.add(CancionModel("Raul","@raul011092","Todo de ti","Rauw Alejandro","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","6/10","Esta bien pero tiene mejores canciones","https://www.youtube.com/watch?v=gklsv2MoNNg"))
        arrayList.add(CancionModel("Eva","@eva040178","Amarillo","J Balvin","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","3/10","No me gusto nada","https://www.youtube.com/watch?v=Vysgv7qVYTo"))
        displayList.addAll(arrayList)

        val myAdapter = RecyclerViewAdapter(displayList,this)

        //Configuración del adapter

        adapter.RecyclerViewAdapter(displayList,this)

        //Configuracion del recycler view
        recycler.hasFixedSize()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter


    }


/*
    private fun canciones(): MutableList<CancionModel> {
        var cancionesModels : MutableList<CancionModel> = ArrayList()
        cancionesModels.add(CancionModel("Jose","@jose010699","Hey brother","Avivii","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg","8/10","Me encanta","https://www.youtube.com/watch?v=6Cp6mKbRTQY"))
        cancionesModels.add(CancionModel("Si estuviésemos juntos","Bad Bunny","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Alone","Alan Walker","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("SAOKO","Rosalía","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Me puse pedo","Sabino","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Dinamite","Taio Cruz","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Balada","Gusttavo Lima","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Experimento","Myke Towers","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Todo de ti","Rauw Alejandro","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))
        cancionesModels.add(CancionModel("Amarillo","J Balvin","https://d1bvpoagx8hqbg.cloudfront.net/259/eb0a9acaa2c314784949cc8772ca01b3.jpg"))



        return cancionesModels
    }
*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        val menuItem = menu!!.findItem(R.id.searchView)
        val recycler : RecyclerView = findViewById(R.id.recycler)
        val searchView = menuItem.actionView as SearchView
       if(menuItem != null){



           searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
               override fun onQueryTextSubmit(query: String?): Boolean {
                   return true
               }

               override fun onQueryTextChange(newText: String?): Boolean {

                   displayList.clear()
                   val searchText = newText!!.toLowerCase(Locale.getDefault())
                   if (searchText.isNotEmpty()){

                       arrayList.forEach{
                           if(it.nombre.toLowerCase(Locale.getDefault()).contains(searchText)){

                            displayList.add(it)

                           }
                       }
                       recycler.adapter?.notifyDataSetChanged()
                   }else{
                       displayList.clear()
                       displayList.addAll(arrayList)
                       recycler.adapter?.notifyDataSetChanged()


                   }
                return false
               }

           })


       }

        return super.onCreateOptionsMenu(menu)
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}


