package com.example.finalproject.video

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalproject.R

class VideoAdapter(context: Context?, demoList: List<VideoBean>) : RecyclerView.Adapter<VideoViewHolder>() {

    /** 保存数据的列表 */
    private val context:Context?
    private val demoList: List<VideoBean>


    init {
        this.context = context
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.video_item, parent, false)
        return VideoViewHolder(view)
    }


    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val itemBean = demoList[position]
        itemBean.coverUrl?.let {
            Glide.with(context!!).load(it).into(holder.ivCover)
        }
        itemBean.content?.let {
            holder.tvContent.text = it
        }
        itemBean.num?.let {
            holder.tvNum.text = it
        }

        holder.ivCover.setOnClickListener {
            val intent: Intent = Intent(context, VideoViewActivity::class.java)
            intent.putExtra("videoUrl", itemBean.videoUrl)
            context!!.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return demoList.size
    }
}