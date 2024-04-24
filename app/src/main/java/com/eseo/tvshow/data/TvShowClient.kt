package com.eseo.tvshow.data

import com.eseo.tvshow.data.service.TvShowService
import retrofit2.Retrofit




class TvShowClient {

  companion object{

    val service : TvShowService? = null

    fun getRetrofitTvShowClient() : TvShowService{



      /*val retrofit = Retrofit.Builder()
          .baseUrl("https://www.episodate.com/api/")
          .build()

      val service : TvShowService = retrofit.create(TvShowService::class.java)
      */
      if (service == null){
        return Retrofit.Builder()
          .baseUrl("https://www.episodate.com/api/")
          .build()
          .create(TvShowService::class.java)
      }

      return service
    }
  }

}