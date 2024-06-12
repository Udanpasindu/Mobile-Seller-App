package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn=findViewById<Button>(R.id.button4)
        btn.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}