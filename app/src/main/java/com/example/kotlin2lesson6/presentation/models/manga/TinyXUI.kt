package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
