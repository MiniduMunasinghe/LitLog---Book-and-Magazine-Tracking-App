package com.example.litlog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_welcom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_welcom)

        val logoImageView = findViewById<ImageView>(R.id.logo)

        logoImageView.setOnClickListener {
            val intent = Intent(this, MainActivity_signup_signin::class.java)
            startActivity(intent)
        }
    }
}
