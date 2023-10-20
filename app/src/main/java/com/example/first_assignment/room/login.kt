package com.example.first_assignment.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class login(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val email : String,
    val password : String
)
