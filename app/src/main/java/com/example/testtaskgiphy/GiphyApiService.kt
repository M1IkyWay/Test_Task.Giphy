package com.example.testtaskgiphy

interface GiphyApiService {

    @GET("gifs/random")
    suspend fun getTrendingGifs(): Response<GiphyResponse>


}