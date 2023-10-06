package com.example.testtaskgiphy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskgiphy.databinding.ActivityMainBinding


const val BASE_URL = "https://api.giphy.com/v1/"
class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter

    fun loadGifs () {}

    fun openGif () {
        val intent = Intent(this@MainActivity, FullScreenGifActivity::class.java)
        startActivity(intent)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        recyclerView = binding.recycterView
        recyclerView.layoutManager = GridLayoutManager(this, 3) // Указываем, что хотим 2 колонки
        adapter = RecyclerViewAdapter(object  : GifActionListener {
            override fun onGifOpen(gifImage: GifImageService) {
                super.onGifOpen(gifImage)
                openGif()
            }
        })

        recyclerView.adapter = adapter




        loadGifs()



    }






}