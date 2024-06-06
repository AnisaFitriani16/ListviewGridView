package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val food:List<FoodItem>) : RecyclerView.Adapter<FoodAdapter.MyViewHolder>(){

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imgFood)
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val description: TextView = itemView.findViewById(R.id.tvOverview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = food[position]
        holder.imageView.setImageResource(item.imageFood)
        holder.title.text= item.title
        holder.description.text = item.description
    }

    override fun getItemCount(): Int {
        return food.size
    }
}