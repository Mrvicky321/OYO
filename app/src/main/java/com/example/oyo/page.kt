package com.example.oyo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page)
        var button2 = findViewById<LinearLayout>(R.id.search)
        button2.setOnClickListener {
            val intent1 = Intent(this, page1::class.java)
            startActivity(intent1)
        }

        var button3 = findViewById<LinearLayout>(R.id.next)
        button3.setOnClickListener {
            val intent1 = Intent(this, page3::class.java)
            startActivity(intent1)
        }

    }

}
