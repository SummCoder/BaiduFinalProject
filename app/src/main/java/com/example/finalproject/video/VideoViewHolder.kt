package com.example.finalproject.video

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

/**
 * 用于复用的ViewHolder
 */
class VideoViewHolder : RecyclerView.ViewHolder {

    /** 封面图 */
    var ivCover: ImageView
        private set
    /** 内容 */
    var tvContent: TextView
        private set

    var tvNum: TextView
        private set



    constructor(view: View) : super(view) {
        ivCover = view.findViewById(R.id.video_image)
        tvContent = view.findViewById(R.id.video_content)
        tvNum = view.findViewById(R.id.video_num)
    }
}