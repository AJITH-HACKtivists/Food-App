package com.example.food_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(var songs:List<String>):RecyclerView.Adapter<AdapterClass.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater:LayoutInflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.items,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.text1.text=songs[position]
    }

    override fun getItemCount(): Int {
        return songs.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
      val image=itemView.findViewById<ImageView>(R.id.image)
        val text1=itemView.findViewById<TextView>(R.id.text)
        val text2=itemView.findViewById<TextView>(R.id.text2)
    }
}
