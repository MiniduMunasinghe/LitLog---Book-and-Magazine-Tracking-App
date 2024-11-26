package com.example.litlog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_signup_signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_signup_signin)

        val signInButton = findViewById<Button>(R.id.btn_sign_in)
        signInButton.setOnClickListener {
            val intent = Intent(this, MainActivity_signin::class.java)
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.btn_sign_up)
        signUpButton.setOnClickListener {
            val intent = Intent(this, MainActivity_signup::class.java)
            startActivity(intent)
        }
    }
}
