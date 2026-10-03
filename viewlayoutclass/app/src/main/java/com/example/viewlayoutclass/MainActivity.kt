package com.example.viewlayoutclass

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewlayoutclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button8.setOnClickListener {
            binding.testImage.visibility = View.INVISIBLE
            binding.button8.visibility = View.VISIBLE
        }

        binding.testImage.setOnClickListener {
            binding.testImage.visibility = View.VISIBLE
            binding.button8.visibility = View.INVISIBLE
        }
    }
}