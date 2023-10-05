package com.example.testtaskgiphy

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApiService {
    @GET("gifs/random") //или @
    suspend fun getRandomGifs(
        @Query("api_key") apiKey: String,
        @Query("q") query: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("rating") rating: String,
        @Query("lang") lang: String
    ): Response<GiphyResponse>

}