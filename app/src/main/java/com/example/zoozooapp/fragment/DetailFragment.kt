package com.example.zoozooapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zoozooapp.R
import com.example.zoozooapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var item: Map<String, String>

    companion object{
        const val COMMONNAME = "commonName"
        const val SCIENTIFICNAME = "scientificName"
        const val DIET = "diet"
        const val LIFESPAN = "lifespan"
        const val WEIGHT = "weight"
        const val LENGTH = "length"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        item = mapOf(
            COMMONNAME to arguments?.getString(COMMONNAME),
            SCIENTIFICNAME to arguments?.getString(SCIENTIFICNAME),
            DIET to arguments?.getString(DIET),
            LIFESPAN to arguments?.getString(LIFESPAN),
            WEIGHT to arguments?.getString(WEIGHT),
            LENGTH to arguments?.getString(LENGTH)
        ) as Map<String, String>

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.animalsName.text = item[COMMONNAME]
        binding.scientificName.text = item[SCIENTIFICNAME]
        binding.animalsDiet.text = item[DIET]
        binding.animalsLifespan.text = item[LIFESPAN]
        binding.animalsWeight.text = item[WEIGHT]
        binding.animalsLength.text = item[LENGTH]
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}