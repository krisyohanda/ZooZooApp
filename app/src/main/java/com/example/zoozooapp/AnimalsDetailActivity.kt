package com.example.zoozooapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zoozooapp.databinding.ActivityAnimalsBinding

class AnimalsDetailActivity : AppCompatActivity() {
    private var _binding: ActivityAnimalsBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val IMAGEANIMAL = "image"
        const val NAMEANIMAL = "name"
        const val INFOANIMAL = "info"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityAnimalsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageAnimalDetail
        image.setImageResource(intent.getIntExtra(IMAGEANIMAL, 0))

        val name = binding.nameAnimalDetail
        name.text = intent.getStringExtra(NAMEANIMAL)


        val info = binding.infoAnimalDetail
        info.text = intent.getStringExtra(INFOANIMAL)
    }
}
