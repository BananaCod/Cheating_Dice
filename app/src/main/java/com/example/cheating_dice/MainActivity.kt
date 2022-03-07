package com.example.cheating_dice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cheating_dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var btn1:Button = binding.btn1
        btn1.setOnClickListener {
            val intent = Intent(this, Na1000::class.java)
            startActivity(intent)
        }

        var btn2:Button = binding.btn2
        btn2.setOnClickListener {
            val intent = Intent(this, na1::class.java)
            startActivity(intent)
        }

    }

}