package com.ciandt.brewerybees.ui.myAvaliations.myRate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.repository.BreweriesRepository
import kotlinx.coroutines.launch

class MyRateViewModel(private val breweriesRepository: BreweriesRepository) : ViewModel() {

   private val _searchEmailErrorLiveData = MutableLiveData<Unit>()
   val searchEmailErrorLiveData: LiveData<Unit> get() = _searchEmailErrorLiveData

   private val _searchEmailListLiveData = MutableLiveData<List<BreweriesModel>>()
   val searchEmailListLiveData: LiveData<List<BreweriesModel>> get() = _searchEmailListLiveData

   fun getSearchListEmail(email: String) {
      viewModelScope.launch {
         val results = breweriesRepository.myEvaluationsEmail(email)
         if (results.isEmpty()) {
            _searchEmailErrorLiveData.value = Unit
         } else {
            _searchEmailListLiveData.value = results
         }
      }
   }
}