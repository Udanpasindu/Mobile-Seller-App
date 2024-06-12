package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn1 = findViewById<Button>(R.id.button3)
        btn1.setOnClickListener() {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}