package com.example.matchessimulator
import androidx.appcompat.app.AppCompatActivity

import android.app.Activity
import android.os.Bundle
import android.text.Layout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.matchessimulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    //lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //val tvHello = findViewById<TextView>(R.id.tvHello)

         binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



    }
}