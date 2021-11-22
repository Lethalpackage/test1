package com.example.test.features.main_screen.data.api

import com.example.test.features.main_screen.data.toDomain
import com.example.test.features.main_screen.domain.model.GiphyDomainModel

class GiphyRepoImpl(private val source: GiphyRemoteSource) : GiphyRepo {
    override suspend fun getGiphy(): List<GiphyDomainModel> {
        return source.getGiphy().data!!.map {data ->
            data.toDomain()
        }

    }


}


