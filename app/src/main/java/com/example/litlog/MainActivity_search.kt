package com.example.litlog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_search)

        val clickme = findViewById<ImageView>(R.id.profile_nav)

        clickme.setOnClickListener {
            val Intent = Intent(this,MainActivity_home::class.java)
            startActivity(Intent)
        }

        val clickme1 = findViewById<ImageView>(R.id.search_nav)

        clickme1.setOnClickListener {
            val Intent = Intent(this,MainActivity_search::class.java)
            startActivity(Intent)
        }

        val clickme2 = findViewById<ImageView>(R.id.book_nav)

        clickme2.setOnClickListener {
            val Intent = Intent(this,MainActivity_books::class.java)
            startActivity(Intent)
        }

        val clickme3 = findViewById<ImageView>(R.id.mag_nav)

        clickme3.setOnClickListener {
            val Intent = Intent(this,MainActivity_magz::class.java)
            startActivity(Intent)
        }

        val clickme4 = findViewById<ImageView>(R.id.book_c)

        clickme4.setOnClickListener {
            val Intent = Intent(this,MainActivity_addBook::class.java)
            startActivity(Intent)
        }
    }
}