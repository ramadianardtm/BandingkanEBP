package com.example.bandingkanebp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = PageAdapter(supportFragmentManager)
        adapter.addFragment(MultigunaFragment(), "Expense")
        viewPager.adapter = adapter
        tab_layout.setupWithViewPager(viewPager)

        tab_layout.getTabAt(0)
    }


}