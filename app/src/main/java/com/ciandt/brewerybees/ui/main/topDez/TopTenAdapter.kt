package com.ciandt.brewerybees.ui.main.topDez

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.databinding.TopTenLayoutBinding
import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.ui.details.BreweryDetailsActivity


class TopTenAdapter(private val breweriesModel: List<BreweriesModel>) :
   RecyclerView.Adapter<TopDezViewHolder>() {

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopDezViewHolder {
      return TopDezViewHolder(TopTenLayoutBinding.inflate(LayoutInflater.from(parent.context),
         parent,
         false
      ))
   }

   override fun onBindViewHolder(holder: TopDezViewHolder, position: Int) {
      holder.bindSearch(breweriesModel[position])
      holder.itemView.setOnClickListener{ view->
         Toast.makeText(view.context, breweriesModel[position].id, Toast.LENGTH_LONG).show()

         val intent = Intent(view.context, BreweryDetailsActivity::class.java)
         intent.putExtra("brewery_id", breweriesModel[position].id)
         view.context.startActivity(intent)
      }
   }

   override fun getItemCount() = breweriesModel.size


}

