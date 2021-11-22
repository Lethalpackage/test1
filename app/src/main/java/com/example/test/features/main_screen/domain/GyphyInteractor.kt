package com.example.test.features.main_screen.domain

import com.example.test.base.attempt
import com.example.test.features.main_screen.data.api.GiphyRepo

class GyphyInteractor(private val repository: GiphyRepo) {
    suspend fun getGiphy() = attempt {
        repository.getGiphy()
    }

}
