package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout)
        val btnMoveActivity: ImageButton = findViewById(R.id.ButtonKembali)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
    }
}