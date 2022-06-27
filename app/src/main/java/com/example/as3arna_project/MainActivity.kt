package com.example.as3arna_project

import android.R.attr.data
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view1: ImageView = findViewById(R.id.group1)
        view1.setOnClickListener {
            val intent = Intent(this, ActivityGroup1::class.java)
            startActivity(intent)
        }
        val view2: ImageView = findViewById(R.id.group2)
        view2.setOnClickListener {
            val intent = Intent(this, ActivityGroup2::class.java)
            startActivity(intent)
        }
        val view3: ImageView = findViewById(R.id.group3)
        view3.setOnClickListener {
            val intent = Intent(this, ActivityGroup3::class.java)
            startActivity(intent)
        }
        val view4: ImageView = findViewById(R.id.group4)
        view4.setOnClickListener {
            val intent = Intent(this, ActivityGroup4::class.java)
            startActivity(intent)
        }
        val view5: ImageView = findViewById(R.id.group5)
        view5.setOnClickListener {
            val intent = Intent(this, Activity5::class.java)
            startActivity(intent)

        }
        val view6: ImageView = findViewById(R.id.imageView6)
        view6.setOnClickListener {
            val intent = Intent(this, Activity6::class.java)
            startActivity(intent)

        }

        val contactBTN : ImageView = findViewById(R.id.contactUS_BTN)
        contactBTN.setOnClickListener {
            val phoneNumber= "+201066051944"
            if(phoneNumber.isNotEmpty()){
                val callIntent = Intent(Intent.ACTION_DIAL)
                callIntent.data = Uri.parse("tel:$phoneNumber")
                startActivity(callIntent)
            }
        }
        val SupportBTN : ImageView = findViewById(R.id.Support_BTN)
        SupportBTN.setOnClickListener {
            val phoneNum= "+201063799988"
            if(phoneNum.isNotEmpty()){
                val call = Intent(Intent.ACTION_DIAL)
                call.data = Uri.parse("tel:$phoneNum")
                startActivity(call)
            }
        }
    }



    }







