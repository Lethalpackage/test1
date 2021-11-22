package com.example.test.features.main_screen.ui

import com.example.test.base.Event
import com.example.test.features.main_screen.domain.model.GiphyDomainModel

data class ViewState(
    val giphyList: List<GiphyDomainModel>,
    val errorMessage: String?,
    val isLoading : Boolean
    )




sealed class DataEvent(): Event{
    object OnLoadData: DataEvent()
    data class SuccessNewsRequest(val giphyList: List<GiphyDomainModel>): DataEvent()
    data class ErrorNewsRequest(val error: Throwable): DataEvent()

}