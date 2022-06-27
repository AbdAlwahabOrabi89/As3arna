package com.example.as3arna_project.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.as3arna_project.R
import com.example.as3arna_project.model.data

class ItemAdapter(val context: Context ,
                  val dataset : List<data>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent , false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_text)
        val imageView : ImageView = view.findViewById(R.id.item_image)


    }
}
