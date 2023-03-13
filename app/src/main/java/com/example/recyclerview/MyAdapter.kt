package com.example.recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<song>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItems = songs[position]

        holder.textViewTitle.text = songs[position].title
        holder.textViewDescription.text = songs[position].description
        holder.imageView.setImageResource(currentItems.imageView)



        var color = "#CCCCCC"
        if (position % 2 == 0){
            color = "#EEEEEE"
        }
        holder.linearLayout.setBackgroundColor(Color.parseColor(color))

    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewTitle = itemView.findViewById<TextView>(R.id.textViewTitle)
        var textViewDescription = itemView.findViewById<TextView>(R.id.textViewDescription)
        //val cardView1 = itemView.findViewById<CardView>(R.id.cardView1)
        var linearLayout = itemView.findViewById<RelativeLayout>(R.id.linearlayout)
        var imageView = itemView.findViewById<ImageView>(R.id.imageView)

    }

}

