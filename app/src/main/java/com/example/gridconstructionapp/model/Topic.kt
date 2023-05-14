package com.example.gridconstructionapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val stringNumbe: Int,
    @DrawableRes val imageResourceId: Int
)