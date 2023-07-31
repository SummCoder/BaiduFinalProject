package com.example.finalproject.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.home.ItemBean
import com.example.finalproject.home.NewsAdapter


class VideoFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: VideoAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val content = requireArguments().getString("content")
//        Toast.makeText(activity, content, Toast.LENGTH_SHORT).show()

        val view = inflater.inflate(R.layout.fragment_video, container, false)

        recyclerView = view.findViewById(R.id.videos)
        adapter = VideoAdapter(context, createDemoDate())

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        return view
    }

    private fun createDemoDate(): ArrayList<VideoBean> {
        // 为首页的新闻recycleView加点内容
        val list = ArrayList<VideoBean>()

        val zeroItem = VideoBean("https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video_cover1.jpeg",
            "过分热情的麦麦暑假工", "播放量：10w",
            "https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video1.mp4")
        val firstItem = VideoBean("https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video_cover2.jpeg",
            "艾特一个比他还傻的人过来看", "播放量：20w",
            "https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video2.mp4")
        val secondItem = VideoBean("https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video_cover3.jpeg",
            "救我于浅滩，溺我于深渊", "播放量：30w",
            "https://git.nju.edu.cn/211250026/baiduvideo/-/raw/main/video3.mp4")

        for (i in 0 until 4) {
            list.add(zeroItem)
            list.add(firstItem)
            list.add(secondItem)
        }

        return list
    }
}