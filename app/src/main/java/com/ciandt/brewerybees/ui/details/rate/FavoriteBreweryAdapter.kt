package com.ciandt.brewerybees.ui.details.rate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.ciandt.brewerybees.ui.mockdata.Favorite
import com.ciandt.brewerybees.R

class FavoriteBreweryAdapter(val favorites: MutableList<Favorite>) : Adapter<FavoriteBreweryAdapter.FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.card_result, parent, false)
    return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(favorites[position])
    }

    override fun getItemCount(): Int = favorites.size

    class FavoriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(favorite: Favorite) {
            with(favorite){
                itemView.findViewById<TextView>(R.id.brewery_name)
                itemView.findViewById<TextView>(R.id.brewery_rate)
                itemView.findViewById<TextView>(R.id.brewery_type_text)
                itemView.findViewById<TextView>(R.id.brewery_distance_txt)
            }
        }
    }
}