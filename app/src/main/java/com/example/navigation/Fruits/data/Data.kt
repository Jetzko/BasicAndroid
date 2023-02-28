package com.example.navigation.Fruits.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.navigation.R

class Data {
    enum class Fruits {
        APPLE, PEAR, BANANA, MELON, GRAPE
    }
    fun fruitIcon(fruits : Fruits) : Int{
        return when(fruits) {
            Fruits.APPLE -> R.drawable.apple
            Fruits.PEAR -> R.drawable.pear
            Fruits.BANANA -> R.drawable.banana
            Fruits.MELON -> R.drawable.melone
            Fruits.GRAPE -> R.drawable.uva
        }
    }

}