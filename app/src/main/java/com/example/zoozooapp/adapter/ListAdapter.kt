package com.example.zoozooapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.zoozooapp.R
import com.example.zoozooapp.data.Animal
import com.example.zoozooapp.data.Data
import com.example.zoozooapp.fragment.AfricanFragmentDirections
import com.example.zoozooapp.fragment.AsianFragmentDirections
import com.example.zoozooapp.fragment.EuropeanFragmentDirections
import com.example.zoozooapp.fragment.NorthAmericanFragmentDirections
import com.example.zoozooapp.fragment.HomeFragment

class ListAdapter(private val context: Context, private val itemId: String): RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val btn: Button = view.findViewById(R.id.btn_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataItem = data[position]
        holder.btn.text = dataItem.commonName
        holder.btn.setOnClickListener {

            when(itemId){
                HomeFragment.AFRICAN -> {
                    val bundle = AfricanFragmentDirections.actionAfricanFragmentToDetailFragment(
                        dataItem.commonName,
                        dataItem.scientificName,
                        dataItem.diet,
                        dataItem.lifespan,
                        dataItem.weight,
                        dataItem.length
                    )
                    holder.btn.findNavController().navigate(bundle)
                }
                HomeFragment.ASIAN -> {
                    val bundle = AsianFragmentDirections.actionAsianFragmentToDetailFragment(
                        dataItem.commonName,
                        dataItem.scientificName,
                        dataItem.diet,
                        dataItem.lifespan,
                        dataItem.weight,
                        dataItem.length
                    )
                    holder.btn.findNavController().navigate(bundle)
                }
                HomeFragment.EUROPEAN -> {
                    val bundle = EuropeanFragmentDirections.actionEuropeanFragmentToDetailFragment(
                        dataItem.commonName,
                        dataItem.scientificName,
                        dataItem.diet,
                        dataItem.lifespan,
                        dataItem.weight,
                        dataItem.length
                    )
                    holder.btn.findNavController().navigate(bundle)
                }
                HomeFragment.NORTHAMERICAN -> {
                    val bundle = NorthAmericanFragmentDirections.actionNorthAmericanFragmentToDetailFragment(
                        dataItem.commonName,
                        dataItem.scientificName,
                        dataItem.diet,
                        dataItem.lifespan,
                        dataItem.weight,
                        dataItem.length
                    )
                    holder.btn.findNavController().navigate(bundle)
                }
            }
        }
    }

    private lateinit var data: List<Animal>

    override fun getItemCount(): Int{
        when(itemId){
            HomeFragment.AFRICAN -> {
                data = Data(context).loadAfricanAnimals()
            }
            HomeFragment.ASIAN -> {
                data = Data(context).loadAsianAnimals()
            }
            HomeFragment.EUROPEAN -> {
                data = Data(context).loadEuropeanAnimals()
            }
            HomeFragment.NORTHAMERICAN -> {
                data = Data(context).loadNorthAmericanAnimals()
            }
        }
        return data.size
    }
}