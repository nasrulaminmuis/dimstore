package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pria)
        val btnMoveActivity: ImageButton = findViewById(R.id.ButtonWanita)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, WanitaActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.ButtonAnak)
        btnMoveActivity2.setOnClickListener{
            val intent = Intent(this, AnakActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity3: ImageButton = findViewById(R.id.image_2)
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