package com.example.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.LinksXXXXXXXXModel

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(
    self, related
)