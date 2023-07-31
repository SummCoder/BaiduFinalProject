package com.example.finalproject.my

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LogoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "登出成功", Toast.LENGTH_SHORT).show()
        // 进行登出后的操作，如跳转到主页
        val bundle = Bundle()
        bundle.putBoolean("isLoggedIn", false)
        val intent = Intent(this, UserActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}