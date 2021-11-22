package com.example.test.features.main_screen.di

import com.example.test.features.main_screen.ui.MainScreenViewModel
import com.example.test.features.main_screen.data.api.GiphyApi
import com.example.test.features.main_screen.data.api.GiphyRemoteSource
import com.example.test.features.main_screen.data.api.GiphyRepo
import com.example.test.features.main_screen.data.api.GiphyRepoImpl
import com.example.test.features.main_screen.domain.GyphyInteractor
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//https://api.giphy.com/v1/gifs/trending?api_key=5jXYMQ523o3GtVMd8ujzCv8beM2nyFJ6&limit=30&rating=pg
const val BASE_URL = "https://api.giphy.com/"

val  mainScreenModule = module{
    viewModel{
        MainScreenViewModel(get <GyphyInteractor>())
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<GiphyApi> {
        get<Retrofit>().create(GiphyApi::class.java)
    }
    single<GiphyRemoteSource> {
        GiphyRemoteSource(api = get<GiphyApi>())
    }
    single<GiphyRepo> {
        GiphyRepoImpl(get<GiphyRemoteSource>())
    }

    single<GyphyInteractor> {
        GyphyInteractor(get<GiphyRepo>())
    }

}
