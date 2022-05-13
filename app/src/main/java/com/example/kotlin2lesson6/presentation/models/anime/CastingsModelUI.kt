package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.CastingsModel

data class CastingsModelUI(
    val links: LinksXXXModelUI?
)
fun CastingsModel.toUI() = CastingsModelUI(links?.toUI())