package com.example.finalproject.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.finalproject.R


class VideoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val content = requireArguments().getString("content")
//        Toast.makeText(activity, content, Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_video, container, false)
    }
}