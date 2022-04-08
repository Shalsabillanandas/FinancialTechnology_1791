package com.example.financialtechnology1791.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.financialtechnology1791.R

class HomeActivity : AppCompatActivity() {
    private lateinit var tvHome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvHome = findViewById(R.id.tv_home)

        var username: String = intent.getStringExtra("username").toString()

        tvHome.setText(username)
    }
}