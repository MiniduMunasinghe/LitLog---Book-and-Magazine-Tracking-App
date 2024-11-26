package com.example.litlog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_signin)

        val clickme = findViewById<Button>(R.id.btn_sign_in)

        clickme.setOnClickListener {
            val Intent = Intent(this,MainActivity_home::class.java)
            startActivity(Intent)
        }
    }
}