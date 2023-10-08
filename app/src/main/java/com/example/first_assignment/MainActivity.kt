package com.example.first_assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.first_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val email = "asad@gmail.com"
    val password = "asad1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.txtregister.setOnClickListener {
            intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            if (binding.emailet.text.toString() == email && binding.passwordet.text.toString() == password) {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }

    }


}