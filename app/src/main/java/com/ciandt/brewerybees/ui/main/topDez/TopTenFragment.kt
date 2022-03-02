package com.ciandt.brewerybees.ui.main.topDez

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ciandt.brewerybees.databinding.FragmentTopTenBinding
import org.koin.androidx.viewmodel.ext.android.viewModel



class TopTenFragment : Fragment() {

    private var _binding: FragmentTopTenBinding ? = null
    private val binding get() = _binding!!
    private val viewModel: TopDezViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTopTenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = this.arguments

        viewModel.topDezLiveData.observe(this.viewLifecycleOwner){list->
            binding.topTenRecycler.adapter = TopTenAdapter(list)
        }

        bundle?.getString("getTopDez").toString().apply {
            viewModel.getTopDez()
        }
    }

}