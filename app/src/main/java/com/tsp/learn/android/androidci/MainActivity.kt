package com.tsp.learn.android.androidci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_btn.setOnClickListener {
            name_lbl.text = "Hello ${user_name.text}! How are you doing today?"
        }
    }
}
