package com.example.activitycc17

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class ImplicitIntentDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_demo)




        val stringExtra :String? =intent.extras!!.getString("extraData")
        if(stringExtra !=null)
            Log.i("ExtraDataFromIntent",stringExtra)
        Toast.makeText(this,"You're logged in Successfully  $stringExtra", Toast.LENGTH_LONG).show()



        findViewById<Button>(R.id.button7).setOnClickListener {displayContacts()}
        findViewById<Button>(R.id.button2).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/jesjoshie"))
            startActivity(i)}

                findViewById<Button>(R.id.button6).setOnClickListener {opencam()}
        findViewById<Button>(R.id.googlemapbtn).setOnClickListener{googlemap()}
        findViewById<Button>(R.id.button).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
            startActivity(i)
        }


    }
    private  fun  displayContacts(){
        val uri = Uri.parse("content://contacts/people")
        val intent2 = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent2)
    }


    private fun opencam(){
        val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }
    private fun googlemap(){
        val intent4 =Intent(Intent.ACTION_VIEW)
        intent4.setData(Uri.parse("geo:19.067,72.877"))
        startActivity(intent4)

    }
}