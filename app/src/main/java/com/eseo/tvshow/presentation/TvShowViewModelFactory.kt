package com.eseo.tvshow.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eseo.tvshow.data.TvShowRepository

class TvShowViewModelFactory(
    private val repository: TvShowRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(TvShowViewModel::class.java)){
            return TvShowViewModel(repository) as T
        }

        return throw IllegalArgumentException("Illegal Argument")
    }

}