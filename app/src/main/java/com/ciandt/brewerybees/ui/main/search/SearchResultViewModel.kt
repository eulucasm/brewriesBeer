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

   private val _searchListErrorLiveData = MutableLiveData<Unit>()
   val searchListErrorLiveData :LiveData<Unit>get() = _searchListErrorLiveData

   fun getSearchList(search: String){
      viewModelScope.launch {
         val results = breweriesRepository.breweriesSearch(search)
         if(results.isEmpty()){
            _searchListErrorLiveData.value = Unit
         }else{
            _searchListLiveData.value = results
         }
      }
   }
}
