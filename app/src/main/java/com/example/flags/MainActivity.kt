package com.example.flags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
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
        val flagsList = mutableListOf<View>()
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.austria_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.colombia_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.denmark_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.italy_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.madagascar_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.poland_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.switzerland_flag, llFlagList, false)
        )
        flagsList.add(
            LayoutInflater.from(this)
                .inflate(layout.thailand_flag, llFlagList, false)
        )

        addViewsToLayoutFlagList(flagsList)
    }

    private fun addViewsToLayoutFlagList(flagsList: MutableList<View>) {
        for (i in flagsList) {
            llFlagList.addView(i)
        }
    }

}