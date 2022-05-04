package com.example.zoozooapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class AnimalsData(
    @DrawableRes val imageAnimalId: Int,
    @StringRes val nameAnimalId: Int,
    @StringRes val infoAnimalId: Int
)