package com.example.first_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.first_assignment.databinding.ActivityMainBinding
import com.example.first_assignment.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSignUp.setOnClickListener {
            val name = binding.nameet.text.toString()
            val email = binding.emailet.text.toString()
            val number = binding.numberet.text.toString()
            val password = binding.passet.text.toString()
            val age = binding.ageet.text.toString()
            if (age.equals("18")){
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
           }else{
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.txtlogin.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}