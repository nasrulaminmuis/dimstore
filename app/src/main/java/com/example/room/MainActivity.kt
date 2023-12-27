package com.example.room


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.EditText
import android.widget.Toast
import com.example.room.data.AppDatabase



class MainActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var database: AppDatabase
    private lateinit var prefManager: PrefManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        userName = findViewById(R.id.editTextText)
        password = findViewById(R.id.editTextTextPassword3)
        database = AppDatabase.getInstance(applicationContext)
        prefManager = PrefManager(this)
        val btnMoveActivity: ImageButton = findViewById(R.id.imageButton3)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }
        val btnMoveActivity2: ImageButton = findViewById(R.id.imageButton2)
        btnMoveActivity2.setOnClickListener{
            val username = userName.text.toString()
            val enteredPassword = password.text.toString()

            val user = database.userDao().getUserByUsername(username)
            if (user != null && user.password == enteredPassword) {
                prefManager.setLoggin(true)
                prefManager.setUsername(username)
                val intent = Intent(this, HalamanUtama::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "kesalahan Username dan password", Toast.LENGTH_SHORT).show()
            }
        }

    }
}