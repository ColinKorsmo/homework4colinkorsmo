package com.example.superheroesapp.data

import com.example.superheroesapp.R
import com.example.superheroesapp.model.Hero

object DataSource {
    val hero = listOf(
        Hero(R.string.hero1, R.string.description1, R.drawable.superhero1, R.string.vuln1, R.string.vulndetail1),
        Hero(R.string.hero2, R.string.description2, R.drawable.superhero2, R.string.vuln2, R.string.vulndetail2),
        Hero(R.string.hero3, R.string.description3, R.drawable.superhero3, R.string.vuln3, R.string.vulndetail3),
        Hero(R.string.hero4, R.string.description4, R.drawable.superhero4, R.string.vuln4, R.string.vulndetail4),
        Hero(R.string.hero5, R.string.description5, R.drawable.superhero5, R.string.vuln5, R.string.vulndetail5),
        Hero(R.string.hero6, R.string.description6, R.drawable.superhero6, R.string.vuln6, R.string.vulndetail6),
    )
}