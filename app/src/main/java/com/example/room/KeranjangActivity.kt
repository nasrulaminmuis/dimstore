package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KeranjangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keranjang)
        val btnMoveActivity3: ImageButton = findViewById(R.id.imageView5)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.ButtonKembali)
        btnMoveActivity2.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
    }
}