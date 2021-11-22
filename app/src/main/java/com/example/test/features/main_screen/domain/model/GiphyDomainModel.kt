package com.example.test.features.main_screen.domain.model

import com.example.test.features.main_screen.data.api.model.ImagesModel
import com.google.gson.annotations.SerializedName

data class GiphyDomainModel(
    val images: ImagesDomainModel,
    val type: String,
    val id: String,
    val url: String,
    val rating: String,
    val title: String,
    val username: String,
    val bitlyGifUrl: String,
    val bitlyUrl: String,
    val embedUrl: String,
    val slug: String,
    val isSticker: Int,
    val source: String,
    val contentUrl: String,
    val sourceTld: String,
    val sourcePostUrl: String


)


/*

    @SerializedName("source")
    val source:String,

    @SerializedName("content_url")
    val contentUrl: String,

    @SerializedName("source_tld")
    val sourceTld: String,

    @SerializedName("source_post_url")
    val sourcePostUrl: String,
*/
