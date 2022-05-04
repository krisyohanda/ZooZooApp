package com.example.zoozooapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zoozooapp.databinding.FragmentHomeBinding
import com.example.zoozooapp.R

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val AFRICAN = "african"
        const val ASIAN = "asian"
        const val EUROPEAN = "european"
        const val NORTHAMERICAN = "northamerican"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}