package com.example.testtaskgiphy

import retrofit2.http.GET

interface GifService {


    @GET("gifs/random?apikey=K3o125E8SgSnyHqUS3XvWQlnyBJ8Hisz")
    fun getGifs () : retrofit2.Call<ListResult>
}