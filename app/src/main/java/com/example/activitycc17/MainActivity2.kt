package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.createBtn).setOnClickListener{create()}
    }
    private fun create(){
        val intent = Intent(this,insideActivity::class.java)
        startActivity(intent)
    }
}