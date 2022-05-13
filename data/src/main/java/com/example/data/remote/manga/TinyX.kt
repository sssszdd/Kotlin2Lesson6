package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.TinyXModel

data class TinyX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun TinyX.toDomain() = TinyXModel(
    width, height
)