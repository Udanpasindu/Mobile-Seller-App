package com.example.mobileseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        val btn2=findViewById<Button>(R.id.button2)
        btn2.setOnClickListener(){
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }


}