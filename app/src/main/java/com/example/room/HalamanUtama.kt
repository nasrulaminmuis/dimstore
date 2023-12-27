package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveActivity: ImageButton = findViewById(R.id.imageView)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity3: ImageButton = findViewById(R.id.imageButton2)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity5: ImageButton = findViewById(R.id.Keranjang)
        btnMoveActivity5.setOnClickListener{
            val intent = Intent(this, KeranjangActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity6: ImageButton = findViewById(R.id.ButtonProdukkk)
        btnMoveActivity6.setOnClickListener{
            val intent = Intent(this, PriaActivity::class.java)
            startActivity(intent)
        }
    }
}