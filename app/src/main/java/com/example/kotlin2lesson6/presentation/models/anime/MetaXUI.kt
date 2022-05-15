package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.MetaXModel

data class MetaXUI(
    val dimensions: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
