package com.example.activitycc17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class insideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)
        val stringExtra :String? =intent.extras!!.getString("extraData")
        if(stringExtra !=null)
            Log.i("ExtraDataFromIntent",stringExtra)
        Toast.makeText(this,"You're logged in Successfully  $stringExtra",Toast.LENGTH_LONG).show()
    }


    }

