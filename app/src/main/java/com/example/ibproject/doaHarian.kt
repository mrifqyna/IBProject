package com.example.ibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_doa_harian.*

class doaHarian : AppCompatActivity() {
    private lateinit var tmblhome : ImageButton
    private lateinit var tombolDoaMakan : ImageView
    private lateinit var tombolDoaSmakan : ImageView
    private lateinit var tombolDoaStidur : ImageView
    private lateinit var tombolDoaBtidur : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        tombolDoaMakan = findViewById(R.id.btnSbMakan)
        tombolDoaMakan.setOnClickListener {
            val intent = Intent(this,DoaSblmMakan::class.java)
            startActivity(intent)
        }
        tombolDoaSmakan = findViewById(R.id.btnsdhMkn)
        tombolDoaSmakan.setOnClickListener {
            val intent = Intent(this, doaSdhMakan::class.java)
            startActivity(intent)
        }
        tombolDoaStidur = findViewById(R.id.btnsblmTdr)
        tombolDoaStidur.setOnClickListener {
            val intent = Intent(this, doaSblmTidur::class.java)
            startActivity(intent)
        }
        tombolDoaBtidur = findViewById(R.id.btnBgnTdr)
        tombolDoaBtidur.setOnClickListener {
            val intent = Intent(this,doaBgnTidur::class.java)
            startActivity(intent)
        }
        tmblhome = findViewById(R.id.btn_home)
        tmblhome.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            btn_back.setOnClickListener {
                this.finish()
            }
        }

    }
}