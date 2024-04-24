package com.eseo.tvshow.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.eseo.tvshow.R
import com.eseo.tvshow.data.TvShowClient
import com.eseo.tvshow.data.TvShowRepository
import com.eseo.tvshow.data.service.TvShowService

class MainActivity : AppCompatActivity() {

    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var repository: TvShowRepository
    private lateinit var tvShowService: TvShowService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowService = TvShowClient.getRetrofitTvShowClient()
        repository = TvShowRepository(tvShowService)

        tvShowViewModel = ViewModelProvider(
            this,
            TvShowViewModelFactory(repository)
        )[TvShowViewModel::class.java]


        tvShowViewModel.getTvShowViewModel(page = 2)


    }
}