package com.ciandt.brewerybees.ui.main.search

import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.databinding.CardResultBinding
import com.ciandt.brewerybees.model.BreweriesModel

class SearchResultViewHolder(private val binding: CardResultBinding): RecyclerView.ViewHolder(binding.root) {



   fun bindSearch(breweriesModel: BreweriesModel) = with(binding.root){
      binding.initialBreweryTxt.text = breweriesModel.name.toString().slice(0..0)
      binding.breweryNameTxt.text = breweriesModel.name.toString()
      binding.rateTxt.text = breweriesModel.average.toString()
      binding.breweryType.text = breweriesModel.breweryType.toString()
      binding.distanceTxt.text = breweriesModel.city.toString()


   }

}