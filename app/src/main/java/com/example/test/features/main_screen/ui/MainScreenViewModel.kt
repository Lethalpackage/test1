package com.example.test.features.main_screen.ui

import com.example.test.base.BaseViewModel
import com.example.test.base.Event
import com.example.test.features.main_screen.domain.GyphyInteractor
import com.example.test.features.main_screen.domain.model.GiphyDomainModel
import java.net.UnknownHostException


class MainScreenViewModel(private val interactor: GyphyInteractor) : BaseViewModel<ViewState>() {
    init {
        processDataEvent(DataEvent.OnLoadData)

    }

    override fun initialViewState(): ViewState {
        return ViewState(
            giphyList = listOf(),
            errorMessage = null,
            isLoading = true
        )
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is DataEvent.OnLoadData -> {
                interactor.getGiphy().fold(
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessNewsRequest(giphyList = it))
                    },
                    onError = {
                        processDataEvent(DataEvent.ErrorNewsRequest(error = it))
                    },

                    )
            }

            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(
                    giphyList = event.giphyList,
                    isLoading = false,
                    errorMessage = null
                )
            }
            is DataEvent.ErrorNewsRequest -> {
                return when (event.error) {
                    is UnknownHostException -> {
                        previousState.copy(errorMessage = "No internet Сonnection")
                    }
                    else -> {
                        previousState.copy(errorMessage = event.error.message)
                    }
                }
            }
        }
        return null
    }
}