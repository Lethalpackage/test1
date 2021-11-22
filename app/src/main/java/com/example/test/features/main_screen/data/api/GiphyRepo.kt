package com.example.test.features.main_screen.data.api

import com.example.test.features.main_screen.domain.model.GiphyDomainModel

interface GiphyRepo {
    suspend fun getGiphy(): List<GiphyDomainModel>
}