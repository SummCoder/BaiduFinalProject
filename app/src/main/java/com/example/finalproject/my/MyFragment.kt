package com.example.finalproject.my

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.finalproject.R

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_logged_in, container, false)

        startActivity(Intent(activity, UserActivity::class.java))

//        view.findViewById<Button>(R.id.btnLogout).setOnClickListener {
//            startActivity(Intent(activity, LogoutActivity::class.java))
//        }

        return view
    }

}