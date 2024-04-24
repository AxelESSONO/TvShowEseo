package com.eseo.tvshow.data

import com.eseo.tvshow.data.remote.TvShowResponseDto
import com.eseo.tvshow.data.service.TvShowService

class TvShowRepository(
    private val tvShowApi: TvShowService
) {

    suspend fun getTvShows(
        page : Int
    ) : TvShowResponseDto{
        return tvShowApi.getTvShows(page)
    }

}