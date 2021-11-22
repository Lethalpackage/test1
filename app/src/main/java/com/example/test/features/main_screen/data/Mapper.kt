package com.example.test.features.main_screen.data

import com.example.test.features.main_screen.data.api.model.GiphyModel
import com.example.test.features.main_screen.data.api.model.ImagesModel
import com.example.test.features.main_screen.domain.model.GiphyDomainModel
import com.example.test.features.main_screen.domain.model.ImagesDomainModel

fun ImagesModel.toDomain() = ImagesDomainModel(
    fixedHeightImages = fixedHeight
)

fun GiphyModel.toDomain() = GiphyDomainModel(
    images = images.toDomain(),
    type = type,
    id = id,
    url = url,
    rating = rating,
    title = title,
    username = username,
    bitlyGifUrl = bitlyGifUrl,
    bitlyUrl = bitlyUrl,
    embedUrl = embedUrl,
    slug = slug,
    isSticker = isSticker,
    source = source,
    contentUrl = contentUrl,
    sourceTld = sourceTld,
    sourcePostUrl = sourcePostUrl,

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