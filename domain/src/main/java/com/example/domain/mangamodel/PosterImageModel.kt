package com.example.domain.mangamodel

data class PosterImageModel(
    val tiny: String,
    val small: String,
    val medium: String,
    val large: String,
    val original: String,
    val meta: MetaModel
)