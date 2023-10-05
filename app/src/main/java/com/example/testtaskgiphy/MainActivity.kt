package com.example.testtaskgiphy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskgiphy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter

    fun loadGifs () {}


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        recyclerView = binding.recycterView
        recyclerView.layoutManager = GridLayoutManager(this, 3) // Указываем, что хотим 2 колонки
        adapter = RecyclerViewAdapter()

        recyclerView.adapter = adapter




        loadGifs()



    }






}