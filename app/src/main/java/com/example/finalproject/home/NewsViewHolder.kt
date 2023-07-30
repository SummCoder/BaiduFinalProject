package com.example.finalproject.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

/**
 * 用于复用的ViewHolder
 */
class NewsViewHolder : RecyclerView.ViewHolder {

    /** 封面图 */
    var ivCover: ImageView
        private set
    /** 内容 */
    var tvContent: TextView
        private set

    var tvSign: TextView
        private set

    var tvFrom: TextView
        private set


    constructor(view: View) : super(view) {
        ivCover = view.findViewById(R.id.cover)
        tvContent = view.findViewById(R.id.tv_content)
        tvSign = view.findViewById(R.id.sign)
        tvFrom = view.findViewById(R.id.from)
    }
}