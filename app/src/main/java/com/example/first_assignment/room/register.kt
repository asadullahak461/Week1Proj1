package com.example.first_assignment.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class register(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val name:String,
    val email:String,
    val contactNo:String,
    val password:String,
    val age:String
)
