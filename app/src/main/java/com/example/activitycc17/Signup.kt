package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        findViewById<Button>(R.id.createBtn).setOnClickListener{create()}
    }
    private fun create(){
        val intent = Intent(this,insideActivity::class.java)
        startActivity(intent)
    }
    }
