package com.ciandt.brewerybees.ui.details.rate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ciandt.brewerybees.databinding.FragmentPhotoGaleryBinding
import com.ciandt.brewerybees.ui.mockdata.fakephotogalery


class PhotoGaleryFragment : Fragment() {

    private var _binding: FragmentPhotoGaleryBinding ? = null


    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhotoGaleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapters = PhotoGaleryAdapter(fakephotogalery())
        val recyclerview = binding.recyclerPhotoGalery
        recyclerview.adapter = adapters

    }
}