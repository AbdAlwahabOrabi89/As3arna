package com.example.as3arna_project.Data

import com.example.as3arna_project.R
import com.example.as3arna_project.model.data

class dataSource {
    fun loadData() : List<data> {
        val list = listOf<data>(
            data(R.string.data1 , R.drawable.img1),
            data(R.string.data2 , R.drawable.img2),
            data(R.string.data3 , R.drawable.img3),
            data(R.string.data4 , R.drawable.img4),
            data(R.string.data5 , R.drawable.img5),
            data(R.string.data6 , R.drawable.img6),
            data(R.string.data7 , R.drawable.img7),
            data(R.string.data8 , R.drawable.img8),


            )
        return list
    }


}