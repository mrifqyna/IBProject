package com.example.ibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_doa_nabi_adam.*

class doaNabiAdam : AppCompatActivity() {
    private lateinit var tmblhome : ImageButton
    private lateinit var tmblSetting : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_nabi_adam)

        tmblhome = findViewById(R.id.btn_home)
        tmblhome.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        tmblSetting = findViewById(R.id.btn_setting)
        tmblSetting.setOnClickListener {
            val intent = Intent(this,setting::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            this.finish()
        }
    }
}