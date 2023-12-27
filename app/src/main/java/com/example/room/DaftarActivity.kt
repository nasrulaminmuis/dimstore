package com.example.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.room.data.AppDatabase
import com.example.room.data.entity.User

class DaftarActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var nama: EditText
    private lateinit var password: EditText

    private lateinit var database: AppDatabase //yg udah di buat di dalam package data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar)
        userName = findViewById(R.id.editTextText)
        nama = findViewById(R.id.editTextText4)
        password = findViewById(R.id.editTextTextPassword3)

        database = AppDatabase.getInstance(applicationContext)

        val btnMoveActivity: ImageButton = findViewById(R.id.BuatAkun)
        btnMoveActivity.setOnClickListener{
            if (userName.text.isNotEmpty() && nama.text.isNotEmpty() && password.text.isNotEmpty()) {
                    //buat nambah data saja
                    database.userDao().insertAll(
                        User(
                            null,
                            userName.text.toString(),
                            nama.text.toString(),
                            password.text.toString()
                        )
                    )
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Mohon lengkapi semua data", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}