package com.example.recycleview

import Adapter.RvAdapter
import Models.User
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var listData: ArrayList<User>
    lateinit var rvAdapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listData = ArrayList()

        for (i in 0..10) {
            listData.add(User("Muhammadumar1", R.drawable.vohidov1))
            listData.add(User("Muhammadumar2", R.drawable.vohidov2))
            listData.add(User("Muhammadumar3", R.drawable.vohidov3))
        }

        rvAdapter = RvAdapter(this, listData)
        rv.adapter = rvAdapter
    }
}