package com.ciandt.brewerybees.ui.myAvaliations.myRate

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.databinding.CardMyRateBinding
import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.ui.details.BreweryDetailsActivity

class MyRateAdapter(private val breweriesModel: List<BreweriesModel>) :
   RecyclerView.Adapter<MyRateViewHolder>() {

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRateViewHolder {
      return MyRateViewHolder(CardMyRateBinding.inflate(LayoutInflater.from(parent.context),
         parent,
         false))
   }

   override fun onBindViewHolder(holder: MyRateViewHolder, position: Int) {

      holder.bindSearchEmail(breweriesModel[position])
      holder.itemView.setOnClickListener{ view ->
         Toast.makeText(view.context, breweriesModel[position].id, Toast.LENGTH_LONG).show()

         val intent = Intent(view.context, BreweryDetailsActivity::class.java)
         intent.putExtra("brewery_id", breweriesModel[position].id)
         view.context.startActivity(intent)
      }
   }

   override fun getItemCount() = breweriesModel.size


}