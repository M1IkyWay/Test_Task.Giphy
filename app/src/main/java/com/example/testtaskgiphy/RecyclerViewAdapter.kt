package com.example.testtaskgiphy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskgiphy.databinding.ItemGifBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.GifViewHolder>(), View.OnClickListener {

    interface AlarmActionListener {

        fun onGifOpen (gifImage: GifImage) {}

    }

    class GifViewHolder (
        val binding : ItemGifBinding
    ) : RecyclerView.ViewHolder(binding.root){
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemGifBinding.inflate(inflater, parent, false)
        val gifImage = binding.gifImage
        binding.root.setOnClickListener(this)
        return GifViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}