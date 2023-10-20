package com.example.first_assignment.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[login::class,register::class], version = 1 )
abstract class AppDatabase: RoomDatabase() {

    abstract fun userDao():UserDao
}