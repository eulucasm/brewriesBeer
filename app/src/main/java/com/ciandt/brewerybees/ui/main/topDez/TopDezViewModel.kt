package com.ciandt.brewerybees.ui.main.topDez

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ciandt.brewerybees.repository.BreweriesRepository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ciandt.brewerybees.model.BreweriesModel
import kotlinx.coroutines.launch

class TopDezViewModel(private val breweriesRepository: BreweriesRepository):ViewModel() {

   private val _topDezLiveData = MutableLiveData<List<BreweriesModel>>()
   val topDezLiveData :LiveData<List<BreweriesModel>>get() = _topDezLiveData

   fun getTopDez(){
      viewModelScope.launch {
         _topDezLiveData.value = breweriesRepository.breweriesSearchTopTen()
      }
   }
}