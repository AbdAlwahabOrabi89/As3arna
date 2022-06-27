package com.example.as3arna_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.as3arna_project.Data.dataSource
import com.example.as3arna_project.adapter.ItemAdapter
import com.example.as3arna_project.model.data

class Activity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)
        val actionBar = supportActionBar
        actionBar!!.title = "المزيد عن قطاع الكتاكيت"

        actionBar.setDisplayHomeAsUpEnabled(true)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview_list)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val list: List<data> = dataSource().loadData()

        recyclerView.adapter = ItemAdapter(this, list)
    }
}