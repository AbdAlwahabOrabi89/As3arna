package com.example.as3arna_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityGroup4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group4)

        val actionBar = supportActionBar
        actionBar!!.title = "قسم أعلاف الرومي"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}