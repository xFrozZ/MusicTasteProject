package com.example.musictasteproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musictasteproject.ItemsAdapter.ItemsAdapterVH

class ItemsAdapter : RecyclerView.Adapter<ItemsAdapterVH>() {


    var itemsModalList = ArrayList<ItemsModal>();

    fun setData(itemsModalList: ArrayList<ItemsModal>){
        this.itemsModalList = itemsModalList;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsAdapterVH {
        return ItemsAdapterVH(LayoutInflater.from(parent.context).inflate(R.layout.tarjeta_layout,parent,false));
    }

    override fun onBindViewHolder(holder: ItemsAdapterVH, position: Int) {

    }

    override fun getItemCount(): Int {
        return itemsModalList.size
    }

    class ItemsAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

       val name = itemView





    }
}