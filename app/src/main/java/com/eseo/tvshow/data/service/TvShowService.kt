package com.eseo.tvshow.data.service

import com.eseo.tvshow.data.remote.TvShowResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TvShowService {

    @GET("most-popular")
    suspend fun getTvShows(
        @Query("page") page : Int
    ) : TvShowResponseDto


    companion object{
        const val BASE_URL = "https://www.episodate.com/api/"
    }

}