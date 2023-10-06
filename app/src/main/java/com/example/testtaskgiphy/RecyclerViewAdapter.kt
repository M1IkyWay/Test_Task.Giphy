package com.example.testtaskgiphy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testtaskgiphy.databinding.ItemGifBinding


//class RecyclerViewAdapter (val context: Context, val list : MutableList<GifObject>, val gifClickListener : GifClickListener)
//    : RecyclerView.Adapter<RecyclerViewAdapter.GifViewHolder>(){
//
//    lateinit var  gListener : GifClickListener
//
//    interface GifClickListener {
//        fun onGifOpen (position: Int) {}
//    }
//
//    fun setOnGifClickListener (listener: GifClickListener) {
//        gListener = listener
//    }
//
//    class GifViewHolder (
//        val binding : ItemGifBinding, listener : GifClickListener
//    ) : RecyclerView.ViewHolder(binding.root) {
//        val imageView = binding.gifImage
//
//        init {
//            itemView.setOnClickListener() {
//                listener.onGifOpen(adapterPosition)
//
//            }
//        }
//    }
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = ItemGifBinding.inflate(inflater, parent, false)
//
//        return GifViewHolder(binding, listener = gListener)
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
//        val data = list[position]
//
//        Glide.with(context).load(data.images.origImage.url)
//            .into(holder.imageView)
//    }
//
//
//}

class RecyclerViewAdapter(
    val context: Context,
    val list: MutableList<GifObject>,
    val gifClickListener: GifClickListener
) : RecyclerView.Adapter<RecyclerViewAdapter.GifViewHolder>() {

    // Уберите lateinit var gListener: GifClickListener

    interface GifClickListener {
        fun onGifOpen(position: Int)
    }

    // Уберите fun setOnGifClickListener(listener: GifClickListener)

    class GifViewHolder(
        val binding: ItemGifBinding,
        val listener: GifClickListener // Изменено здесь
    ) : RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.gifImage

        init {
            itemView.setOnClickListener() {
                listener.onGifOpen(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemGifBinding.inflate(inflater, parent, false)

        // Изменено здесь, передаем gifClickListener
        return GifViewHolder(binding, listener = gifClickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        val data = list[position]

        Glide.with(context).load(data.images.origImage.url)
            .into(holder.imageView)
    }
}
