package com.example.room.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true) var uid:Int? = null,
    @ColumnInfo(name = "username") var userName: String?,
    @ColumnInfo(name = "name") var name:String?,
    @ColumnInfo(name = "password") var password:String?
)
