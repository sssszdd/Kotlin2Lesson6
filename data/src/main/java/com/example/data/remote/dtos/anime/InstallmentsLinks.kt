package com.example.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.domain.models.anime.LinksXXXXModel

data class LinksXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXX.toDomain() = LinksXXXXModel(
    self, related
)