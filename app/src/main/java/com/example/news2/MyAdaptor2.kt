package com.example.news2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
    class MyAdaptor2 (private var newslist:ArrayList<neww>): RecyclerView.Adapter<MyAdaptor2.MyViewHolder2>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2{
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
            return MyViewHolder2(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
            val currentitem = newslist[position]
            val imageResource = holder.titleimage2.setImageResource(currentitem.tittleimage)
            holder.tvheading2.text=currentitem.heading
        }

        override fun getItemCount(): Int {
            return newslist.size
        }
        class MyViewHolder2(itemView: View): RecyclerView.ViewHolder(itemView){
            val titleimage2 : ShapeableImageView =itemView.findViewById(R.id.titleimage2)
            val tvheading2 : TextView =itemView.findViewById(R.id.tvheading2)
        }
}