package com.example.as3arna_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityGroup1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group1)

        val actionBar = supportActionBar
        actionBar!!.title = "قسم أعلاف التسمين"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}