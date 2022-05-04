package com.example.zoozooapp.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.zoozooapp.R

class AnimalsViewModel {
    private val _image = MutableLiveData<Int>()
    private val _name = MutableLiveData<String>()
    private val _info = MutableLiveData<String>()

    val image: LiveData<Int> = _image
    val name: LiveData<String> = _name
    val info: LiveData<String> = _info

    fun loadAnimalsData(): List<AnimalsData>{
        return listOf(
            AnimalsData(R.drawable.image1, R.string.aardvark_name, R.string.info1),
            AnimalsData(R.drawable.image2, R.string.addax_name, R.string.info2),
            AnimalsData(R.drawable.image3, R.string.african_civet_name, R.string.info3),
            AnimalsData(R.drawable.image4, R.string.hippopotamus_name, R.string.info4),
            AnimalsData(R.drawable.image5, R.string.xerus_name, R.string.info5),
            AnimalsData(R.drawable.image6, R.string.ape_name, R.string.info6),
            AnimalsData(R.drawable.image7, R.string.dwarf_hamster_name, R.string.info7),
            AnimalsData(R.drawable.image8, R.string.fire_eel_name, R.string.info8),
            AnimalsData(R.drawable.image9, R.string.japanese_macaque_name, R.string.info9),
            AnimalsData(R.drawable.image10, R.string.siberian_tiger_name, R.string.info10),
            AnimalsData(R.drawable.image11, R.string.barn_owl_name, R.string.info11),
            AnimalsData(R.drawable.image12, R.string.chamois_name, R.string.info12),
            AnimalsData(R.drawable.image13, R.string.grouse_name, R.string.info13),
            AnimalsData(R.drawable.image14, R.string.stag_beetle_name, R.string.info14),
            AnimalsData(R.drawable.image15, R.string.woodlouse_spider_name, R.string.info15),
            AnimalsData(R.drawable.image16, R.string.alaskan_husky_name, R.string.info16),
            AnimalsData(R.drawable.image17, R.string.bald_eagle_name, R.string.info17),
            AnimalsData(R.drawable.image18, R.string.deer_tick_name, R.string.info18),
            AnimalsData(R.drawable.image19, R.string.hawaiian_monk_seal_name, R.string.info19),
            AnimalsData(R.drawable.image20, R.string.pileated_woodpecker_name, R.string.info20)
        )
    }

    fun setData(data: AnimalsData, context: Context){
        _image.value = data.imageAnimalId
        _name.value = context.getString(data.nameAnimalId)
        _info.value = context.getString(data.infoAnimalId)
    }
}