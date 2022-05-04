package com.example.zoozooapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zoozooapp.R
import com.example.zoozooapp.adapter.AnimalsAdapter
import com.example.zoozooapp.data.AnimalsViewModel
import com.example.zoozooapp.databinding.FragmentAnimalsBinding
import com.example.zoozooapp.databinding.FragmentHomeBinding

class AnimalsFragment : Fragment() {

    private var _binding: FragmentAnimalsBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAnimalsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.animalsRecycler
        recyclerView.adapter = AnimalsAdapter(requireContext(), AnimalsViewModel().loadAnimalsData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}