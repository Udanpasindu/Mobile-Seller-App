package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pro2details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro2details)

        val btn1 = findViewById<Button>(R.id.button13)
        btn1.setOnClickListener() {
            val intent = Intent(this, Paymentgateway::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.button16)
        btn2.setOnClickListener() {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }
    }
}