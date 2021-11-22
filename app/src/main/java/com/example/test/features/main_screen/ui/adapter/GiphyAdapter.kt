package com.example.test.features.main_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.features.main_screen.domain.model.GiphyDomainModel

class GiphyAdapter(private var models: List<GiphyDomainModel>) :
    RecyclerView.Adapter<GiphyAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView

        init {
            this.title = view.findViewById<TextView>(R.id.container)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_giphy, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.title.text = models[position].title
    }

    override fun getItemCount(): Int {
        return models.size
    }
    fun updateArticle(newModels: List<GiphyDomainModel>){
        models = newModels
        notifyDataSetChanged()
    }
}