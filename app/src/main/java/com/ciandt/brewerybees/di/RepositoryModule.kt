package com.ciandt.brewerybees.di

import com.ciandt.brewerybees.repository.BreweriesRepository
import com.ciandt.brewerybees.repository.BreweriesRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

   factory<BreweriesRepository> {

      BreweriesRepositoryImpl(get())

   }
}