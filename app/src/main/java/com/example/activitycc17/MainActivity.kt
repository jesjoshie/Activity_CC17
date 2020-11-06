package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.signupBtn).setOnClickListener { signup() }
        findViewById<Button>(R.id.loginBtn).setOnClickListener { login() }

    }private fun login() {

val intent = Intent(this, ImplicitIntentDemo::class.java)
        intent.putExtra("extraData", "")
        startActivity(intent)

    }

    private fun signup() {
        val intent2 = Intent(this, MainActivity2::class.java)
        startActivity(intent2)

    }


}

