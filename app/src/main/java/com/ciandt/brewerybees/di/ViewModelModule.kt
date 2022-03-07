package com.ciandt.brewerybees.di

import com.ciandt.brewerybees.ui.details.datails.BreweryDetailsViewModel
import com.ciandt.brewerybees.ui.main.search.SearchResultViewModel
import com.ciandt.brewerybees.ui.main.topDez.TopDezViewModel
import com.ciandt.brewerybees.ui.myAvaliations.myRate.MyRateViewModel
import org.koin.dsl.module

val viewModelModule = module {

   factory { SearchResultViewModel(get()) }
   factory { MyRateViewModel(get()) }
   factory { TopDezViewModel(get()) }
}