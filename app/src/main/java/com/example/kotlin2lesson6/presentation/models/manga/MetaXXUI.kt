package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
