package com.ciandt.brewerybees

import android.app.Application
import com.ciandt.brewerybees.di.networkingModule
import com.ciandt.brewerybees.di.repositoryModule
import com.ciandt.brewerybees.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BreweriesApp : Application() {

   override fun onCreate() {
      super.onCreate()
      initKoin()
   }

   private fun initKoin() {
      startKoin() {
         androidContext(this@BreweriesApp)
         modules(networkingModule, repositoryModule, viewModelModule)
      }
   }
}