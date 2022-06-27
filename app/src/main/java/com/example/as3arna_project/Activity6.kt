package com.example.as3arna_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)
        val actionBar = supportActionBar
        actionBar!!.title = "About US"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val about: ImageView = findViewById(R.id.button1_6)
        about.setOnClickListener {
            WebPage("https://elkenany.com/Guide-company/303")

        }
        val prices: ImageView = findViewById(R.id.button2_6)
        prices.setOnClickListener {
            Web("https://elkenany.com/stock-fodder/2?company_id=303")

        }



    }
    fun WebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

            startActivity(intent)
        }

    fun Web(url: String) {
        val page: Uri = Uri.parse(url)
        val intent_2 = Intent(Intent.ACTION_VIEW, page)

            startActivity(intent_2)

    }
}