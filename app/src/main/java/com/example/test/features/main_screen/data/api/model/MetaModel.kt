package com.example.test.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class MetaModel(
    @SerializedName("status")
    val status: Int,

    @SerializedName("msg")
    val msg: String,

    @SerializedName("response_id")
    val responseId: String,
)
