package com.ciandt.brewerybees.ui.main.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.repository.BreweriesRepository
import kotlinx.coroutines.launch

class SearchResultViewModel(private val breweriesRepository: BreweriesRepository) : ViewModel() {

   private val _searchListLiveData = MutableLiveData<List<BreweriesModel>>()
   val searchListLiveData : LiveData<List<BreweriesModel>>get() = _searchListLiveData

   fun getSearchList(search: String){
      viewModelScope.launch {
         _searchListLiveData.value = breweriesRepository.breweriesSearch(search)
      }
   }

}