package com.example.ibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var tomboldoaHarian : ImageView
    private lateinit var tomboldoatolakbala : ImageView
    private lateinit var tomboldoasetelahsholat : ImageView
    private lateinit var tomboldoaParananabi : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        tomboldoaHarian = findViewById(R.id.btnHarian)
        tomboldoaHarian.setOnClickListener {
            val intent = Intent(this,doaHarian::class.java)
            startActivity(intent)
        }
        tomboldoatolakbala = findViewById(R.id.btnTolakBala)
        tomboldoatolakbala.setOnClickListener {
            val intent = Intent(this,DoaTbala::class.java)
            startActivity(intent)
        }
        tomboldoasetelahsholat = findViewById(R.id.btnDoaSholat)
        tomboldoasetelahsholat.setOnClickListener {
            val intent = Intent(this,doaSetelahSholat::class.java)
            startActivity(intent)
        }
        tomboldoaParananabi = findViewById(R.id.btnDoaNabi)
        tomboldoaParananabi.setOnClickListener {
            val intent = Intent(this,DoaNabi::class.java)
            startActivity(intent)
        }
    }

}