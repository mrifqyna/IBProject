package com.example.ibproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_setting.*
class setting : AppCompatActivity() {
    private lateinit var tmbllogout: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        tmbllogout = findViewById(R.id.btn_logout)
        tmbllogout.setOnClickListener {
            finish()

        }
    }

}