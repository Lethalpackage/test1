package com.example.test.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class FixedHeightImages(
    @SerializedName("height")
    val height: Int,

    @SerializedName("width")
    val width: Int,

    @SerializedName("size")
    val size: Long,

    @SerializedName("url")
    val url: String,

    @SerializedName("mp4")
    val mp4: String,

    @SerializedName("mp4_size")
    val mp4Size: String,

    @SerializedName("webp")
    val webp: String,

    @SerializedName("webp_size")
    val webpSize: String,


)
