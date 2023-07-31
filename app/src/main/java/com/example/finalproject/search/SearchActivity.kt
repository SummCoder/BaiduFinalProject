package com.example.finalproject.search

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        findViewById<ImageView>(R.id.search_back).setOnClickListener {
            onBackPressed()
        }

        // 获取搜索框中的内容
        findViewById<ImageView>(R.id.search_online).setOnClickListener {
            val editText = findViewById<EditText>(R.id.searchEditText2)
            val str = editText.text.toString()
            val intent: Intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("search_content", str)
            Log.i("hello", str)
            startActivity(intent)
        }
    }
}
