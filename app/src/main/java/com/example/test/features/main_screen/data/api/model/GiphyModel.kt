package com.example.test.features.main_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class GiphyModel(

    @SerializedName("images")
    val images: ImagesModel,

    @SerializedName("type")
    val type: String,

    @SerializedName("id")
    val id: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("rating")
    val rating: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("username")
    val username: String,

    @SerializedName("bitly_gif_url")
    val bitlyGifUrl: String,

    @SerializedName("bitly_url")
    val bitlyUrl: String,

    @SerializedName("embed_url")
    val embedUrl: String,

    @SerializedName("slug")
    val slug: String,

    @SerializedName("is_sticker")
    val isSticker: Int,

    @SerializedName("source")
    val source:String,

    @SerializedName("content_url")
    val contentUrl: String,

    @SerializedName("source_tld")
    val sourceTld: String,

    @SerializedName("source_post_url")
    val sourcePostUrl: String,


    )
