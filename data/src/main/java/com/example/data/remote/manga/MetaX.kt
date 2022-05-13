package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.MetaXModel

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)