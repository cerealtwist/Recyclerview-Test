package com.example.recyclerview1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val context: Context, private val item: List<Items>, val listener: (Items) -> Unit)
    :RecyclerView.Adapter<ItemAdapter.ItemsViewHolder>(){

    class ItemsViewHolder(view: View): RecyclerView.ViewHolder(view) {


        val imgItems1 = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameItems = view.findViewById<TextView>(R.id.tv_item_name)
        val descItems = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(item: Items, listener: (Items) -> Unit){
            imgItems1.setImageResource(item.imgItems1)
            nameItems.text = item.nameItems
            descItems.text = item.descItems
            itemView.setOnClickListener{
                listener(item)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        return ItemsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_featured, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bindView(item[position], listener)
    }

    override fun getItemCount(): Int = item.size

    }