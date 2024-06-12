package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        val btn1 = findViewById<Button>(R.id.button18)
        btn1.setOnClickListener() {
            val intent = Intent(this, Myprofileupdated::class.java)
            startActivity(intent)
        }
    }
}