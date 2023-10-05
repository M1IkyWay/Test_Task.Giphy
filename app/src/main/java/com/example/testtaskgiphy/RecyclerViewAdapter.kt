package com.example.testtaskgiphy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtaskgiphy.databinding.ItemGifBinding

interface GifActionListener {
    fun onGifOpen (gifImage: GifImageService) {}
}

class RecyclerViewAdapter (val gifActionListener : GifActionListener) : RecyclerView.Adapter<RecyclerViewAdapter.GifViewHolder>(), View.OnClickListener {



    class GifViewHolder (
        val binding : ItemGifBinding
    ) : RecyclerView.ViewHolder(binding.root){
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemGifBinding.inflate(inflater, parent, false)

            //переносить ли он байнд вью холдер?
//        val gifImage = binding.gifImage
        binding.root.setOnClickListener(this)
        return GifViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
//        holder.itemView.tag =


    }

    override fun onClick(v: View) {
//        val gif = v.tag as GifImageService.GifImage
        TODO("Not yet implemented")
    }
}