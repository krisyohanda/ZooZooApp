package com.example.zoozooapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoozooapp.R
import com.example.zoozooapp.adapter.ListAdapter
import com.example.zoozooapp.databinding.FragmentAfricanBinding
import com.example.zoozooapp.databinding.FragmentNorthAmericanBinding

class NorthAmericanFragment : Fragment() {
    private var _binding : FragmentNorthAmericanBinding? = null
    private val binding get() = _binding!!

    private lateinit var rv : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNorthAmericanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemId = HomeFragment.NORTHAMERICAN

        rv = binding.rv
        rv.layoutManager = LinearLayoutManager(context)
        rv.adapter = ListAdapter(requireContext(), itemId)
        rv.setHasFixedSize(true)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}