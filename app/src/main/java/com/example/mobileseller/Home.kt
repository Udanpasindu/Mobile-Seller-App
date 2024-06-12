package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn1 = findViewById<Button>(R.id.button7)
        btn1.setOnClickListener() {
            val intent = Intent(this, pro1details::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.button8)
        btn2.setOnClickListener() {
            val intent = Intent(this, pro2details::class.java)
            startActivity(intent)
        }
     //change1
        //button
        val btn3 = findViewById<Button>(R.id.button17)
        btn3.setOnClickListener() {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }


    }
}