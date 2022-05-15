package com.example.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.TitlesModel

data class Titles(
    @SerializedName("en")
    val en: String?,
    @SerializedName("en_jp")
    val enJp: String?,
    @SerializedName("ja_jp")
    val jaJp: String?
)

fun Titles.toDomain() = TitlesModel(en, enJp, jaJp)