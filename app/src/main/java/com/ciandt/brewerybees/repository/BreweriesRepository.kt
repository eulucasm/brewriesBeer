package com.ciandt.brewerybees.repository

import com.ciandt.brewerybees.model.BreweriesModel

interface BreweriesRepository {

   suspend fun breweriesSearch(search: String) : List<BreweriesModel>
   suspend fun myEvaluationsEmail(email: String): List<BreweriesModel>
   suspend fun breweriesSearchTopTen(): List<BreweriesModel>
}