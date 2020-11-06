package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.createBtn).setOnClickListener { login() }

    }

    private fun login() {
        val intent = Intent(this, ImplicitIntentDemo::class.java)
        intent.putExtra("extraData", "")
        startActivity(intent)
    }

}
