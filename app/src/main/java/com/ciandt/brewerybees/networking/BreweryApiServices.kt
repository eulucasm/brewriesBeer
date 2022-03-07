package com.ciandt.brewerybees.networking

import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.model.PhotosItemModel
import com.ciandt.brewerybees.model.RateModal
import retrofit2.Response
import retrofit2.http.*

interface BreweryApiServices {

   @GET("/breweries")
   suspend fun breweriesSearch(
      @Query(value = "by_city",
         encoded = true) by_city: String,
   ): List<BreweriesModel>

   @GET("/breweries/myEvaluations/{email}")
   suspend fun myEvaluationsEmail(
      @Path(value = "email", encoded = true) email: String,
   ): List<BreweriesModel>

   @GET("/breweries/topTen")
   suspend fun breweriesSearchTopTen(): List<BreweriesModel>

   @GET("/breweries/{breweryId}")
   suspend fun breweriesSearchForId(
      @Path(value= "breweryId", encoded = true) email:String
   ): BreweriesModel

}
