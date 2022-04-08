package com.example.firebaseconnection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebaseconnection.databinding.ActivityAuthBinding

class Auth : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}