package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.loginBtn).setOnClickListener{login()}
        findViewById<Button>(R.id.signupBtn).setOnClickListener{signup()}
    }
    private fun login(){
        val intent = Intent(this,insideActivity::class.java)
        startActivity(intent)
    }
    private  fun signup(){
        val intent1 = Intent(this,Signup::class.java)
        startActivity(intent1)

    }
}
