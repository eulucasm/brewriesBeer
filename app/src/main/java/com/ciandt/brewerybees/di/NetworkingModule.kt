package com.ciandt.brewerybees.di

import com.ciandt.brewerybees.BuildConfig
import com.ciandt.brewerybees.networking.BreweryApiServices
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val networkingModule  = module {

   single {
      OkHttpClient.Builder().build()
   }
   single{
      Retrofit.Builder()
         .baseUrl(BuildConfig.BASE_URL)
         //.addCallAdapterFactory(CoroutinesDataSourceCallAdapterFactory.create())
         .addConverterFactory(MoshiConverterFactory.create())
         .build()
   }

   single{
      val retrofit = get<Retrofit>()
      retrofit.create(BreweryApiServices::class.java)
   }
}