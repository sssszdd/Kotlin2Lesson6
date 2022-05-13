package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.MangaDataModel

data class MangaData(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("attributes")
    val mangaDto: MangaDto,
    @SerializedName("relationships")
    val relationships: Relationships
)

fun MangaData.toDomain() =
    MangaDataModel(
        id,
        type,
        links.toDomain(),
        mangaDto.toDomain(),
        relationships.toDomain()
    )