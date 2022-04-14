package com.example.news2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdaptor (private var newslist:ArrayList<neww>): RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = newslist[position]
        val imageResource = holder.titleimage.setImageResource(currentitem.tittleimage)
        holder.tvheading.text=currentitem.heading
    }

    override fun getItemCount(): Int {
        return newslist.size
    }
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleimage : ShapeableImageView =itemView.findViewById(R.id.titleimage)
        val tvheading : TextView =itemView.findViewById(R.id.tvheading)
    }
    
}