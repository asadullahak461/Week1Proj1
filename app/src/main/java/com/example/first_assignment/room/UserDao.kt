package com.example.first_assignment.room

import androidx.room.Dao
import androidx.room.Insert


@Dao
interface UserDao {

    @Insert
    fun insertLogin(login: login)

    @Insert
    fun addUser(register: register)
}