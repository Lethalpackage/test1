package com.example.test.features.main_screen.data.api


import com.example.test.features.main_screen.data.api.model.TrendingGiphyModel

class GiphyRemoteSource(private val api: GiphyApi) {
    suspend fun getGiphy (): TrendingGiphyModel = api.getTrending()

}
