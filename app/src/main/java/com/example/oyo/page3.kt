package com.example.oyo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        var button1 = findViewById<ImageView>(R.id.close)
        button1.setOnClickListener {
            val intent1 =  Intent(this,page::class.java)
            startActivity(intent1)
        }
    }
}