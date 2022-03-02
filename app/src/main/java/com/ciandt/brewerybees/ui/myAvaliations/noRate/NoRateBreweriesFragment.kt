package com.ciandt.brewerybees.ui.myAvaliations.noRate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ciandt.brewerybees.R


class NoRateBreweriesFragment : Fragment() {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
   }
   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?,
   ): View? {
      return inflater.inflate(R.layout.fragment_no_rate_breweries, container, false)
   }
}