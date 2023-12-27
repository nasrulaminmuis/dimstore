package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class ProfilActivity : AppCompatActivity() {
    private lateinit var prefManager: PrefManager
    private lateinit var username: String
    private lateinit var tvUser: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halamanprofil)
        prefManager = PrefManager(this)
        username = prefManager.getUsername().toString()
        tvUser = findViewById(R.id.textView22)
        tvUser.text = username
        val btnMoveActivity: ImageButton = findViewById(R.id.ButtonRiwayat)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, RiwayatActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.ButtonKeranjang)
        btnMoveActivity2.setOnClickListener{
            val intent = Intent(this, KeranjangActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity3: ImageButton = findViewById(R.id.ButtonKelola)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, KelolaActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity4: ImageButton = findViewById(R.id.ButtonRumah)
        btnMoveActivity4.setOnClickListener{
            val intent = Intent(this, HalamanUtama::class.java)
            startActivity(intent)
        }
        val btnMoveActivity5: ImageButton = findViewById(R.id.TombolProduk)
        btnMoveActivity5.setOnClickListener{
            val intent = Intent(this, PriaActivity::class.java)
            startActivity(intent)
        }
    }
}