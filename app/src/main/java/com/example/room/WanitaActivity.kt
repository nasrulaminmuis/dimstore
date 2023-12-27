package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WanitaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wanita)
        val btnMoveActivity: ImageButton = findViewById(R.id.ButtonPria)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, PriaActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.ButtonAnak)
        btnMoveActivity2.setOnClickListener{
            val intent = Intent(this, AnakActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity3: ImageButton = findViewById(R.id.ButtonKembali)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
        val btnMoveActivity4: ImageButton = findViewById(R.id.imageButton2)
        btnMoveActivity4.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity5: ImageButton = findViewById(R.id.imageButton1)
        btnMoveActivity5.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
    }
}