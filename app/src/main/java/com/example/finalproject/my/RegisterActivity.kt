package com.example.finalproject.my

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class RegisterActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val databaseHelper = UserDBHelper(this)

        findViewById<Button>(R.id.btnRegister).setOnClickListener {
            val username = findViewById<EditText>(R.id.etUsername).text.toString()
            val password = findViewById<EditText>(R.id.etPassword).text.toString()
            val confirmPassword = findViewById<EditText>(R.id.etConfirmPassword).text.toString()

            if (password == confirmPassword) {
                val success = databaseHelper.registerUser(username, password)
                if (success) {
                    Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this, "注册失败", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "密码不一致", Toast.LENGTH_SHORT).show()
            }
        }
    }
}