package com.example.testtaskgiphy

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GifService {


    @GET("/v1/gifs/trending")

    fun getGifs(@Query("apiKey") apiKey: String): retrofit2.Call<ListResult>
}