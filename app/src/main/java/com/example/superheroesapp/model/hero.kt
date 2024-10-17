package com.example.superheroesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(

    @StringRes val hero: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val vuln: Int,
    @StringRes val vulndetail: Int
)
