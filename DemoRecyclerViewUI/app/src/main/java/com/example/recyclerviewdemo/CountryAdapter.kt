package com.example.recyclerviewdemo

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class CountryAdapter(val countries:Array<String>,val itemClickListener:View.OnClickListener): RecyclerView.Adapter<CountryAdapter.ViewHolder>(){

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val icon = itemView.findViewById<View>(R.id.icon) as ImageView
        val name = itemView.findViewById<View>(R.id.name) as TextView
        val cardView = itemView.findViewById<View>(R.id.cardView) as CardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, itemType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.activity_item_country,parent,false)
        return ViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val country = countries[position]
        holder.icon.setImageResource(R.mipmap.ic_launcher)
        holder.name.text = country
        holder.cardView.tag = position
        holder.cardView.setOnClickListener(itemClickListener)
    }
}