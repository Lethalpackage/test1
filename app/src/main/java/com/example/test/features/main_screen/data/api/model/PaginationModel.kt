package com.example.test.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class PaginationModel(
    @SerializedName("total_count")
    val totalCount: Int,

    @SerializedName("count")
    val count: Int,

    @SerializedName("offset")
    val offset: Int,
)
