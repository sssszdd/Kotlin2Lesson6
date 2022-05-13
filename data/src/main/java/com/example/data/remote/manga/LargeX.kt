package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.LargeXModel

data class LargeX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun LargeX.toDomain() = LargeXModel(
    width, height
)