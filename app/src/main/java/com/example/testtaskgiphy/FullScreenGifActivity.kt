package com.example.testtaskgiphy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtaskgiphy.databinding.ActivityFullScreenGifBinding
import com.example.testtaskgiphy.databinding.ActivityMainBinding

class FullScreenGifActivity : AppCompatActivity() {
    lateinit var binding: ActivityFullScreenGifBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFullScreenGifBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}