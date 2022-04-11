package com.example.flags

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.flags.R.id
import com.example.flags.R.layout

class MainActivity : AppCompatActivity() {
    private lateinit var llFlagList: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        initViews()
        inflateViews()
    }

    private fun initViews() {
        llFlagList = findViewById(id.llMain)
    }

    private fun inflateViews() {
        val flagsList = mutableListOf(
            layout.austria_flag,
            layout.colombia_flag,
            layout.denmark_flag,
            layout.italy_flag,
            layout.madagascar_flag,
            layout.poland_flag,
            layout.switzerland_flag,
            layout.thailand_flag
        )

        addViewsToLayoutFlagList(flagsList)
    }

    private fun addViewsToLayoutFlagList(flagsList: MutableList<Int>) {
        for (i in flagsList) {
            llFlagList.addView(
                LayoutInflater.from(this)
                    .inflate(i, llFlagList, false)
            )
        }
    }

}