package com.example.first_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.first_assignment.databinding.ActivityMainBinding
import com.example.first_assignment.databinding.ActivitySignUpBinding
import com.example.first_assignment.room.AppDatabase
import com.example.first_assignment.room.DatabaseBuilder
import com.example.first_assignment.room.register

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var database:AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = DatabaseBuilder.getInstance(this)

        binding.btnSignUp.setOnClickListener {
            val name = binding.nameet.text.toString()
            val email = binding.emailet.text.toString()
            val number = binding.numberet.text.toString()
            val password = binding.passet.text.toString()
            val age = binding.ageet.text.toString()

            val userObj= register(name=name, email = email, contactNo = number, password = password, age = age)

            database.userDao().addUser(userObj)

        }
        binding.txtlogin.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}