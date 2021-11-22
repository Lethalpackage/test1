package com.example.test.features.main_screen.data.api


import com.example.test.features.main_screen.data.api.model.TrendingGiphyModel
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.giphy.com/v1/gifs/trending?api_key=5jXYMQ523o3GtVMd8ujzCv8beM2nyFJ6&limit=30&rating=pg
interface GiphyApi {
    @GET("v1/gifs/trending")
    suspend fun getTrending(
        @Query("limit") limit: Int = 30,
        @Query("rating") rating: String = "pg",
        @Query("apiKey") apiKey: String = "5jXYMQ523o3GtVMd8ujzCv8beM2nyFJ6",
        @Query("offset") offset: Int = 5,
        @Query("bundle") bundle: String = "sticker_layering"


    ): TrendingGiphyModel

}


