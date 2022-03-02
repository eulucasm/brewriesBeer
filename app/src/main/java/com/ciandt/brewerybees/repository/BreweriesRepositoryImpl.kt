package com.ciandt.brewerybees.repository

import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.networking.BreweryApiServices

class BreweriesRepositoryImpl(private val service: BreweryApiServices) : BreweriesRepository {

   override suspend fun breweriesSearch(search: String): List<BreweriesModel> {

      val responseSearch = service.breweriesSearch(search)
      var data: List<BreweriesModel>? = listOf<BreweriesModel>()

//      responseSearch
//         .onSuccess {
//            data = this.data
//         }.onError {
//            data = listOf<BreweriesModel>()
//         }.onException {
//            data = listOf<BreweriesModel>()
//         }
      //TODO ("lembrar de implementar tratamento de erro")
      return responseSearch
   }

   override suspend fun myEvaluationsEmail(email: String): List<BreweriesModel> {
      val responseSearchEmail = service.myEvaluationsEmail(email)
      var data: List<BreweriesModel>? = listOf<BreweriesModel>()
      return responseSearchEmail
   }

   override suspend fun breweriesSearchTopTen(): List<BreweriesModel> {
      return service.breweriesSearchTopTen()
   }


}