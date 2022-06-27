package com.example.as3arna_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityGroup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group2)
        val actionBar = supportActionBar
        actionBar!!.title = "قسم أعلاف البياض"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}