package com.example.first_assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.first_assignment.databinding.ActivityMainBinding
import com.example.first_assignment.room.AppDatabase
import com.example.first_assignment.room.DatabaseBuilder
import com.example.first_assignment.room.login

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: AppDatabase


    val email = "asad@gmail.com"
    val password = "asad1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        database = DatabaseBuilder.getInstance(this)

        binding.txtregister.setOnClickListener {
            intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            var email = binding.emailet.text.toString()
            var password = binding.passwordet.text.toString()

            val myObj = login(email = email, password = password)
            database.userDao().insertLogin(myObj)

        }

    }

}