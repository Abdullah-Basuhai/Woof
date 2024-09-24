package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
    Dog(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2),
    Dog(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3),
    Dog(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4),
    Dog(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5),
    Dog(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
    Dog(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7),
    Dog(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8),
    Dog(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9),
    Dog(R.drawable.koda, R.string.dog_name_10, 5, R.string.dog_description_10),
    Dog(R.drawable.lola, R.string.dog_name_11, 11, R.string.dog_description_11),
    Dog(R.drawable.frankie, R.string.dog_name_12, 6, R.string.dog_description_12),
    Dog(R.drawable.nox, R.string.dog_name_13, 7, R.string.dog_description_13),
    Dog(R.drawable.faye, R.string.dog_name_14, 3, R.string.dog_description_14),
    Dog(R.drawable.bella, R.string.dog_name_15, 1, R.string.dog_description_15),
    Dog(R.drawable.moana, R.string.dog_name_16, 1, R.string.dog_description_16),
    Dog(R.drawable.tzeitel, R.string.dog_name_17, 2, R.string.dog_description_17),
    Dog(R.drawable.leroy, R.string.dog_name_18, 9, R.string.dog_description_18)
)
