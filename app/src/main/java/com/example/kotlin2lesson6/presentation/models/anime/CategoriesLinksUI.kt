package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.LinksXXModel


data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)