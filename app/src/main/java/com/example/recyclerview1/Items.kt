package com.example.recyclerview1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Items(
    val imgItems1: Int,
    val nameItems: String,
    val descItems: String
) : Parcelable

