package com.example.finalproject.weather

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R

/**
 * 用于复用的ViewHolder
 *
 * @author: xiejikun
 * @since: 2023/7/7
 */
class WeatherViewHolder : RecyclerView.ViewHolder {
    /** 时间 */
    var tvContent: TextView
        private set
    /** 天气图 */
    var ivCover: ImageView
        private set


    constructor(view: View) : super(view) {
        tvContent = view.findViewById(R.id.time)
        ivCover = view.findViewById(R.id.weatherView)
    }
}