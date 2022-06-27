package com.example.as3arna_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.as3arna_project.Data.dataSource
import com.example.as3arna_project.adapter.ItemAdapter
import com.example.as3arna_project.model.data
import javax.sql.DataSource

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)



        val actionBar = supportActionBar
        actionBar!!.title = "قسم الكتاكيت"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val contact_us: ImageView = findViewById(R.id.group5_button)
        contact_us.setOnClickListener {
            openWebPage("https://www.facebook.com/EloubourGroup")

        }

        val extraBTN: ImageView = findViewById(R.id.activity5_BTN2)
        extraBTN.setOnClickListener {
            val intent = Intent(this, Activity7::class.java)
            startActivity(intent)

        }

    }

    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

            startActivity(intent)

    }
}