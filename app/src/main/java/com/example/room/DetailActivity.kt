package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        val btnMoveActivity: ImageButton = findViewById(R.id.image_2)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.imageButton3)
        btnMoveActivity2.setOnClickListener{
            val intent = Intent(this, PriaActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity3: ImageButton = findViewById(R.id.imageButton2)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}