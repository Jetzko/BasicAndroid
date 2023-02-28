package com.example.navigation.Fruits.data

import com.example.navigation.R

class Datasource {
    fun loadFruit() : List<Fruit> {
        return listOf<Fruit>(
            Fruit(R.string.apple, R.drawable.apple),
            Fruit(R.string.pear, R.drawable.pear),
            Fruit(R.string.banana, R.drawable.banana),
            Fruit(R.string.melon, R.drawable.melone),
            Fruit(R.string.grape, R.drawable.uva)

        )
    }
}