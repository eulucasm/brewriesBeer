package com.ciandt.brewerybees.ui.main.topDez

import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.CardMyRateBinding
import com.ciandt.brewerybees.databinding.TopTenLayoutBinding
import com.ciandt.brewerybees.model.BreweriesModel
import com.squareup.picasso.Picasso

class TopDezViewHolder(private val binding: TopTenLayoutBinding) :
   RecyclerView.ViewHolder(binding.root) {

   fun bindSearch(breweriesModel: BreweriesModel) = with(binding.root) {
      binding.breweryName.text = breweriesModel.name.toString()
      binding.breweryRate.text = breweriesModel.average.toString()
      binding.breweryTypeText.text = breweriesModel.breweryType.toString()
      binding.breweryDistanceTxt.text = breweriesModel.country

      val picasso = Picasso.get()
      var photo: String = ""
      if (breweriesModel.photos!!.isNotEmpty()){
         photo = breweriesModel.photos?.get(0).toString()
      }else{
         photo = "https://s2.glbimg.com/ASugX-UbRujEdYoO7Pv-CXbfCoU=/smart/e.glbimg.com/og/ed/f/original/2019/10/03/69788743_1408348505985249_4118057545833119744_n.jpg"
      }

      picasso.load(photo)
         .resize(400,340)
         .centerCrop()
         .error(R.drawable.background_photo)
         .into(binding.backgroundPhoto)
   }

}