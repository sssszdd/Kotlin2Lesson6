package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXX.toDomain() = LinksXXXXXModel(self, related)