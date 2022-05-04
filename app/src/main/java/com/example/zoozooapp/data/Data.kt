package com.example.zoozooapp.data

import android.content.Context
import com.example.zoozooapp.R

class Data(private val context: Context) {
    fun loadAfricanAnimals(): List<Animal>{
        return listOf(
            Animal(context.getString(R.string.aardvark_name),
            "Orycteropus afer",context.getString(R.string.aardvark_diet),
                context.getString(R.string.aardvark_lifespan), context.getString(R.string.aardvark_weight),
                context.getString(R.string.aardvark_length)),
            Animal(context.getString(R.string.addax_name),
                "Addax nasomaculatus",context.getString(R.string.addax_diet),
                context.getString(R.string.addax_lifespan), context.getString(R.string.addax_weight),
                context.getString(R.string.addax_length)),
            Animal( context.getString(R.string.african_civet_name),
                "Civettictis civetta",context.getString(R.string.african_civet_diet),
                context.getString(R.string.african_civet_lifespan), context.getString(R.string.african_civet_weight),
                context.getString(R.string.african_civet_length)),
            Animal( context.getString(R.string.hippopotamus_name),
                "Hippopotamus amphibius",context.getString(R.string.hippopotamus_diet),
                context.getString(R.string.hippopotamus_lifespan), context.getString(R.string.hippopotamus_weight),
                context.getString(R.string.hippopotamus_length)),
            Animal( context.getString(R.string.xerus_name),
                "Xerus erythropus",context.getString(R.string.xerus_diet),
                context.getString(R.string.xerus_lifespan), context.getString(R.string.xerus_weight),
                context.getString(R.string.xerus_length))
        )
    }

    fun loadAsianAnimals(): List<Animal>{
        return listOf(
            Animal( context.getString(R.string.ape_name),
                "Hominoidea",context.getString(R.string.ape_diet),
                context.getString(R.string.ape_lifespan), context.getString(R.string.ape_weight),
                context.getString(R.string.ape_length)),
            Animal( context.getString(R.string.dwarf_hamster_name),
                "Cricetulus barabensis",context.getString(R.string.dwarf_hamster_diet),
                context.getString(R.string.dwarf_hamster_lifespan), context.getString(R.string.dwarf_hamster_weight),
                context.getString(R.string.dwarf_hamster_length)),
            Animal( context.getString(R.string.fire_eel_name),
                "Mastacembelus erythrotaenia",context.getString(R.string.fire_eel_diet),
                context.getString(R.string.fire_eel_lifespan), context.getString(R.string.fire_eel_weight),
                context.getString(R.string.fire_eel_length)),
            Animal( context.getString(R.string.japanese_macaque_name),
                "Macaca fuscata",context.getString(R.string.japanese_macaque_diet),
                context.getString(R.string.japanese_macaque_lifespan), context.getString(R.string.japanese_macaque_weight),
                context.getString(R.string.japanese_macaque_length)),
            Animal( context.getString(R.string.siberian_tiger_name),
                "Panthera Tigris Altaica",context.getString(R.string.siberian_tiger_diet),
                context.getString(R.string.siberian_tiger_lifespan), context.getString(R.string.siberian_tiger_weight),
                context.getString(R.string.siberian_tiger_length))
        )
    }

    fun loadEuropeanAnimals(): List<Animal>{
        return listOf(
            Animal( context.getString(R.string.barn_owl_name),
                "Tyto alba",context.getString(R.string.barn_owl_diet),
                context.getString(R.string.barn_owl_lifespan), context.getString(R.string.barn_owl_weight),
                context.getString(R.string.barn_owl_length)),
            Animal( context.getString(R.string.chamois_name),
                "Rupicapra rupicapra",context.getString(R.string.chamois_diet),
                context.getString(R.string.chamois_lifespan), context.getString(R.string.chamois_weight),
                context.getString(R.string.chamois_length)),
            Animal( context.getString(R.string.grouse_name),
                "Tetraoninae",context.getString(R.string.grouse_diet),
                context.getString(R.string.grouse_lifespan), context.getString(R.string.grouse_weight),
                context.getString(R.string.grouse_length)),
            Animal( context.getString(R.string.stag_beetle_name),
                "-",context.getString(R.string.stag_beetle_diet),
                context.getString(R.string.stag_beetle_lifespan), context.getString(R.string.stag_beetle_weight),
                context.getString(R.string.stag_beetle_length)),
            Animal( context.getString(R.string.woodlouse_spider_name),
                "Dysdera crocata",context.getString(R.string.woodlouse_spider_diet),
                context.getString(R.string.woodlouse_spider_lifespan), context.getString(R.string.woodlouse_spider_weight),
                context.getString(R.string.woodlouse_spider_length))
        )
    }

    fun loadNorthAmericanAnimals(): List<Animal>{
        return listOf(
            Animal( context.getString(R.string.alaskan_husky_name),
                "Canis lupus",context.getString(R.string.alaskan_husky_diet),
                context.getString(R.string.alaskan_husky_lifespan), context.getString(R.string.alaskan_husky_weight),
                context.getString(R.string.alaskan_husky_length)),
            Animal( context.getString(R.string.bald_eagle_name),
                "Haliaeetus Leucocephalus",context.getString(R.string.bald_eagle_diet),
                context.getString(R.string.bald_eagle_lifespan), context.getString(R.string.bald_eagle_weight),
                context.getString(R.string.bald_eagle_length)),
            Animal( context.getString(R.string.deer_tick_name),
                "Ixodes Scapularis",context.getString(R.string.deer_tick_diet),
                context.getString(R.string.deer_tick_lifespan), context.getString(R.string.deer_tick_weight),
                context.getString(R.string.deer_tick_length)),
            Animal( context.getString(R.string.hawaiian_monk_seal_name),
                "Neomonachus schauinslandi",context.getString(R.string.hawaiian_monk_seal_diet),
                context.getString(R.string.hawaiian_monk_seal_lifespan), context.getString(R.string.hawaiian_monk_seal_weight),
                context.getString(R.string.hawaiian_monk_seal_length)),
            Animal( context.getString(R.string.pileated_woodpecker_name),
                "Dryocopus pileatus",context.getString(R.string.pileated_woodpecker_diet),
                context.getString(R.string.pileated_woodpecker_lifespan), context.getString(R.string.pileated_woodpecker_weight),
                context.getString(R.string.pileated_woodpecker_length))
        )
    }
}