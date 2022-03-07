package com.example.cheating_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cheating_dice.databinding.ActivityNa1Binding

class na1 : AppCompatActivity() {

    private lateinit var binding: ActivityNa1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNa1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar = supportActionBar

        if(actionBar !=null) {
            actionBar.title = "Back"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }
}