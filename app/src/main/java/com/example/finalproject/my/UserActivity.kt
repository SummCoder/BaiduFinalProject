package com.example.finalproject.my

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
//      获取登录信息，默认为未登录
        val isLoggedIn = intent.getBooleanExtra("isLoggedIn", false)
//        Log.i("hello", isLoggedIn.toString())

        if(!isLoggedIn){
            setContentView(R.layout.activity_not_logged_in)
            findViewById<Button>(R.id.btnLogin).setOnClickListener {
                startActivity(Intent(this, LoginActivity::class.java))
            }
            findViewById<Button>(R.id.btnRegister).setOnClickListener {
                startActivity(Intent(this, RegisterActivity::class.java))
            }
        }else{
//            startActivity(Intent(this, MyFragment::class.java))
            setContentView(R.layout.activity_logged_in)
            findViewById<Button>(R.id.btnLogout).setOnClickListener {
                startActivity(Intent(this, LogoutActivity::class.java))
            }
        }
    }
}
