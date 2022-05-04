package com.example.zoozooapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zoozooapp.AnimalsDetailActivity
import com.example.zoozooapp.R
import com.example.zoozooapp.data.AnimalsData
import com.example.zoozooapp.data.AnimalsViewModel

class AnimalsAdapter(private val context: Context, private val dataset: List<AnimalsData>): RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder>() {
    private val viewModel = AnimalsViewModel()

    class AnimalsViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.imageAnimal)
        val nameText: TextView = view.findViewById(R.id.nameAnimal)
        val infoAnimal: TextView = view.findViewById(R.id.infoAnimal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.animals_item, parent, false)
        return AnimalsViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageAnimalId)
        holder.nameText.text = context.resources.getString(item.nameAnimalId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, AnimalsDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
                putExtra("info", viewModel.info.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}