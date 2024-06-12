package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Paymentstatus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentstatus)

        val btn2 = findViewById<Button>(R.id.button12)
        btn2.setOnClickListener() {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}