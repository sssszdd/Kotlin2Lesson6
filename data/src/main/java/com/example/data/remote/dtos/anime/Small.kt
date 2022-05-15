package com.example.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.SmallModel

data class Small(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Small.toDomain() = SmallModel(width, height)