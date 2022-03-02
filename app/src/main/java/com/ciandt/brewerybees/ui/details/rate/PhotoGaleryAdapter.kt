package com.ciandt.brewerybees.ui.details.rate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.ui.mockdata.PhotoGaleryList

class PhotoGaleryAdapter (val photogalerys: MutableList<PhotoGaleryList>) : RecyclerView.Adapter<PhotoGaleryAdapter.PhotoGaleryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoGaleryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_galery_layout, parent, false)
        return PhotoGaleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoGaleryViewHolder, position: Int) {
        holder.bind(photogalerys[position])
    }

    override fun getItemCount(): Int = photogalerys.size

    inner class PhotoGaleryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(photogalery: PhotoGaleryList){
            with(photogalery){

            }

        }
    }
}