package com.example.learning

import android.content.Context
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class LearningAdapter (var listName : List<String>, val context : Context) : RecyclerView.Adapter<LearningAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = from(context).inflate(R.layout.item_names, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getName.text = listName[position]
    }

    override fun getItemCount(): Int {
        return listName.size
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val getName = view.findViewById<AppCompatTextView>(R.id.title_name)
    }

}
