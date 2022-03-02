package com.ciandt.brewerybees.ui.myAvaliations.myRate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.repository.BreweriesRepository
import kotlinx.coroutines.launch

class MyRateViewModel(private val breweriesRepository: BreweriesRepository): ViewModel() {

   private val _searchEmailListLiveData = MutableLiveData<List<BreweriesModel>>()
   val searchEmailListLiveData: LiveData<List<BreweriesModel>>get() = _searchEmailListLiveData

   fun getSearchListEmail(email: String){
      viewModelScope.launch {
         _searchEmailListLiveData.value = breweriesRepository.myEvaluationsEmail(email)
      }
   }
}