package com.example.testtaskgiphy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskgiphy.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


const val BASE_URL = "https://api.giphy.com/v1/"
class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter



    fun openGif () {
        val intent = Intent(this@MainActivity, FullScreenGifActivity::class.java)
        startActivity(intent)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val gifList = mutableListOf<GifObject>()


        recyclerView = binding.recycterView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 3) // Указываем, что хотим 2 колонки
        adapter = RecyclerViewAdapter(gifList, object  : GifActionListener {
            override fun onGifOpen(gifImage: GifImageService) {
                super.onGifOpen(gifImage)
                openGif()
            }
        })
        recyclerView.adapter = adapter

        val retrofit = Retrofit.Builder ()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofitService = retrofit.create(GifService ::class.java)
        retrofitService.getGifs().enqueue(object : Callback<ListResult?> {
            override fun onResponse(call: Call<ListResult?>, response: Response<ListResult?>) {
                val body = response.body()
            }
            override fun onFailure(call: Call<ListResult?>, t: Throwable) {
                Log.d("No response", "")
            }
        })



    }






}