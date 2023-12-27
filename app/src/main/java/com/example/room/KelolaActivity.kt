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

class KelolaActivity : AppCompatActivity() {
    private lateinit var prefManager: PrefManager
    private lateinit var username: String
    private lateinit var etUserName: EditText
    private lateinit var etName: EditText
    private lateinit var etPassword: EditText
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelolaakun)
        database = AppDatabase.getInstance(applicationContext)
        prefManager = PrefManager(this)
        username = prefManager.getUsername().toString()
        val user = database.userDao().getUserByUsername(username)
        etUserName = findViewById(R.id.editTextText2)
        etName = findViewById(R.id.editTextText3)
        etPassword = findViewById(R.id.editTextText5)
        etUserName.setText(user.userName)
        etName.setText(user.name)
        etPassword.setText(user.password)
        val btnMoveActivity3: ImageButton = findViewById(R.id.ButtonBackk)
        btnMoveActivity3.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val btnSimpan: Button = findViewById(R.id.buttondeleteakun2)
        btnSimpan.setOnClickListener {
            val updatedUser = User(user.uid, etUserName.text.toString(), etName.text.toString(), etPassword.text.toString())
            database.userDao().update(updatedUser)
            Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()
        }

        val btnHapusAkun: Button = findViewById(R.id.buttondeleteakun)
        btnHapusAkun.setOnClickListener {
            database.userDao().delete(user)
            Toast.makeText(this, "Akun berhasil dihapus", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}