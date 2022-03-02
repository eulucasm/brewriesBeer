package com.ciandt.brewerybees.ui.myAvaliations.myRate

import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.databinding.CardMyRateBinding
import com.ciandt.brewerybees.model.BreweriesModel

class MyRateViewHolder(private val binding: CardMyRateBinding): RecyclerView.ViewHolder(binding.root) {

   fun bindSearchEmail(breweriesModel: BreweriesModel) = with(binding.root){
      binding.myBreweryName.text = breweriesModel.name.toString()
      binding.myInitialBrewery.text = breweriesModel.name.toString().slice(0..0)
      binding.myRateNote.text = breweriesModel.average.toString()
   }
}