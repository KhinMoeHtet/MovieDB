package com.kmh.moviedb.api

import com.kmh.moviedb.model.NowPlayingModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiInterface {

    @GET("now_playing")
    fun getNowPlaying(
            @Query("api_key")api_key:String
    ):Call<NowPlayingModel>


    @GET("upcoming")
    fun getUpcoming(
        @Query("api_key")api_key:String
    ):Call<NowPlayingModel>




}