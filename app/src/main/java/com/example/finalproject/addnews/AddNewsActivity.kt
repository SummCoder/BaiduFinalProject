package com.example.finalproject.addnews

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class AddNewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnews)

//        点击两图标在手机相册中选择图片
        findViewById<ImageView>(R.id.add_image1).setOnClickListener{
            sign = 1
            val intent = Intent(Intent.ACTION_PICK, null)
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*")
            startActivityForResult(intent, PICK_IMAGE_REQUEST)
        }
        findViewById<ImageView>(R.id.add_image2).setOnClickListener {
            sign = 2
            val intent = Intent(Intent.ACTION_PICK, null)
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*")
            startActivityForResult(intent, PICK_IMAGE_REQUEST)
        }
        findViewById<TextView>(R.id.add_news).setOnClickListener{
//            弹条消息，说明添加新闻成功，并未实际添加到新闻列表中去
            Toast.makeText(this, "添加新闻成功", Toast.LENGTH_SHORT).show()
            onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK && data != null) {
            if (sign == 1) {
                val selectedImage: Uri? = data.data
                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedImage)
                // 将选中的图像设置为第一个ImageView的图标
                findViewById<ImageView>(R.id.add_image1).setImageBitmap(bitmap)
            } else if (sign == 2) {
                val selectedImage: Uri? = data.data
                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedImage)
                // 将选中的图像设置为第二个ImageView的图标
                findViewById<ImageView>(R.id.add_image2).setImageBitmap(bitmap)
            }
        }
    }


    companion object {
        private const val PICK_IMAGE_REQUEST = 1
        private var sign = 0
    }


}