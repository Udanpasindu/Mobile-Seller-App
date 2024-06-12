package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Paymentgateway : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentgateway)

        val btn1 = findViewById<Button>(R.id.button6)
        btn1.setOnClickListener() {
            val intent = Intent(this, Paymentstatus::class.java)
            startActivity(intent)
        }
    }
}