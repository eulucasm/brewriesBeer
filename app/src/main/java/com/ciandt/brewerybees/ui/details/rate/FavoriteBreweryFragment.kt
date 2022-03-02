package com.ciandt.brewerybees.ui.details.rate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ciandt.brewerybees.databinding.FragmentFavoriteBreweryBinding
import com.ciandt.brewerybees.ui.mockdata.fakefavorite


class FavoriteBreweryFragment : Fragment() {

        private var _binding: FragmentFavoriteBreweryBinding ? = null

        private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavoriteBreweryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = FavoriteBreweryAdapter(fakefavorite())
        val recyclerView = binding.recyclerFavBrewery
        recyclerView.adapter = adapter
    }
}