package com.eseo.tvshow.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eseo.tvshow.data.TvShowRepository
import com.eseo.tvshow.data.remote.TvShowResponseDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TvShowViewModel(
    private val repository: TvShowRepository
) : ViewModel() {

    private var _tvShowFlow : MutableStateFlow<TvShowResponseDto>? = null
    val tvShowFlow : MutableStateFlow<TvShowResponseDto>? =_tvShowFlow

    fun getTvShowViewModel(
        page : Int
    ) = viewModelScope.launch(Dispatchers.IO){
        _tvShowFlow?.value = repository.getTvShows(page)
    }

}