package com.ciandt.brewerybees.ui.myAvaliations.ratedMail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.FragmentRatedMailBinding

class RatedMailFragment : Fragment() {

   var emailListener: ((String) -> Unit?)? = null

   private var _binding: FragmentRatedMailBinding? = null
   private val binding get() = _binding!!

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
   }

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?,
   ): View? {
      _binding = FragmentRatedMailBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      binding.buttonEmail.setOnClickListener {
         val emailSubmit = binding.emailRequire.text.toString()
         emailListener?.let { it(emailSubmit) }
      }

   }

}