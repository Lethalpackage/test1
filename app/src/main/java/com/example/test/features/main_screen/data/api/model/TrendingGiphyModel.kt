package com.example.test.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class TrendingGiphyModel (

    @SerializedName("data")
    val data: List<GiphyModel>?,

    @SerializedName("pagination")
    val pagination:  List<PaginationModel>?,

    @SerializedName("meta")
    val meta: List<MetaModel>,
)
