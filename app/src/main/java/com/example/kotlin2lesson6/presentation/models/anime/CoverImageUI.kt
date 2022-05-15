package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.CoverImageModel


data class CoverImageUI(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXUI
)

fun CoverImageModel.toUI() = CoverImageUI(tiny, small, large, original, meta.toUI())
