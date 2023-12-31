package com.example.finalproject.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.video.VideoViewActivity

class NewsAdapter(context: Context?, demoList: List<ItemBean>) : RecyclerView.Adapter<NewsViewHolder>() {
//    class NewsAdapter(context: Context?, demoList: List<ItemBean>) : RecyclerView.Adapter<NewsViewHolder>
    /** 保存数据的列表 */
    private val demoList: List<ItemBean>
    private val context: Context?

    init {
        this.demoList = demoList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(view)
    }


    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
//        Log.i("hello", (position).toString())
        val itemBean = demoList[position]
        if (position < 2) {
            holder.ivCover.setImageResource(0) // 设置图片为空
            holder.ivCover.visibility = View.GONE // 隐藏图片视图
        } else {
            itemBean.coverUrl?.let {
                holder.ivCover.setImageResource(it)
                holder.ivCover.visibility = View.VISIBLE // 显示图片视图
            }
        }

        itemBean.content?.let {
            holder.tvContent.text = it
        }
        itemBean.newsFrom?.let {
            holder.tvFrom.text = it
        }
        itemBean.newsSign?.let {
            holder.tvSign.text = it
        }

        holder.tvContent.setOnClickListener {
            val intent: Intent = Intent(context, NewsDetailActivity::class.java)
            context!!.startActivity(intent)
        }
//        Log.i("hello", holder.tvContent.text.toString())
    }


    override fun getItemCount(): Int {
//        Log.i("hello", demoList.size.toString())
        return demoList.size
    }
}