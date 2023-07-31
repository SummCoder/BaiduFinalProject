package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.finalproject.addnews.AddNewsActivity
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.my.MyFragment
import com.example.finalproject.weather.WeatherActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity  : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

//        静态fragment不可用该方法传递
//        val isLoggedIn = intent.getBooleanExtra("isLoggedIn", true)
//        val myFragment = MyFragment()
//        val bundle = Bundle()
//        bundle.putBoolean("isLoggedIn", isLoggedIn)
//        myFragment.arguments = bundle

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //获取底部导航栏控件
        val navView: BottomNavigationView = binding.navView

        //获取容器控件
        val navController = findNavController(R.id.nav_host_fragment)

        //通过setupWithNavController将底部导航和导航控制器进行绑定
//        NavigationUI.setupWithNavController(bottomNavigation,navController);
        navView.setupWithNavController(navController)

//        val isLoggedIn = intent.getBooleanExtra("isLoggedIn", true)
//        val myFragment = supportFragmentManager.findFragmentById(R.id.navigation_my) as? MyFragment
//        if(myFragment == null){
//            Log.i("world3", "hahaha")
//        }
//        Log.i("world", isLoggedIn.toString())
//        myFragment?.setIsLoggedIn(isLoggedIn)

    }
}