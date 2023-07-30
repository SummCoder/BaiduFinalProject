package com.example.finalproject.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.weather.WeatherBean
import com.example.finalproject.weather.WeatherViewHolder

class WeatherAdapter : RecyclerView.Adapter<WeatherViewHolder> {

    /** 保存数据的列表 */
    private val demoList: List<WeatherBean>

    constructor(demoList: List<WeatherBean>) {
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return WeatherViewHolder(view)
    }


    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val itemBean = demoList[position]


        itemBean.content?.let {
            holder.tvContent.text = it
        }

        itemBean.coverUrl?.let {
            holder.ivCover.setImageResource(it)
        }
    }


    override fun getItemCount(): Int {
        return demoList.size
    }
}