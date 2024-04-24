package com.eseo.tvshow.data.remote


import com.google.gson.annotations.SerializedName

data class TvShowResponseDto(
    @SerializedName("page")
    val page: Int,

    @SerializedName("pages")
    val pages: Int,

    @SerializedName("total")
    val total: String,

    @SerializedName("tv_shows")
    val tvShows: List<TvShowDto>
)