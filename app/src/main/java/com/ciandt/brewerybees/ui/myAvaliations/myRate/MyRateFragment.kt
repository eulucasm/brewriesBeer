package com.ciandt.brewerybees.ui.myAvaliations.myRate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ciandt.brewerybees.databinding.FragmentMyRateBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class MyRateFragment : Fragment() {

   private var _binding: FragmentMyRateBinding? = null
   private val binding get() = _binding!!
   private val viewModel: MyRateViewModel by viewModel()

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
   }

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?,
   ): View? {
      _binding = FragmentMyRateBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      val bundle = this.arguments

      viewModel.searchEmailListLiveData.observe(this.viewLifecycleOwner) { list ->
         binding.recyclerSearchResult.adapter = MyRateAdapter(list)
      }
      bundle?.getString("inputEmail").toString().run {
         viewModel.getSearchListEmail(this)
      }
   }

}