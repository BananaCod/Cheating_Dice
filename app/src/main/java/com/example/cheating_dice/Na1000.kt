package com.example.cheating_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cheating_dice.databinding.ActivityNa1000Binding

class Na1000 : AppCompatActivity() {

    private lateinit var binding: ActivityNa1000Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNa1000Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar = supportActionBar
        if(actionBar !=null) {
            actionBar.title = "Back"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }
}