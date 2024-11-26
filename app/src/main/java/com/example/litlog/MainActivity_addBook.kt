package com.example.litlog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity_addBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_add_book)

        val profileNav = findViewById<ImageView>(R.id.profile_nav)
        profileNav.setOnClickListener {
            val intent = Intent(this, MainActivity_home::class.java)
            startActivity(intent)
        }

        val searchNav = findViewById<ImageView>(R.id.search_nav)
        searchNav.setOnClickListener {
            val intent = Intent(this, MainActivity_search::class.java)
            startActivity(intent)
        }

        val bookNav = findViewById<ImageView>(R.id.book_nav)
        bookNav.setOnClickListener {
            val intent = Intent(this, MainActivity_books::class.java)
            startActivity(intent)
        }

        val magNav = findViewById<ImageView>(R.id.mag_nav)
        magNav.setOnClickListener {
            val intent = Intent(this, MainActivity_magz::class.java)
            startActivity(intent)
        }
    }
}
