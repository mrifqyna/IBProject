package com.example.ibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_doa_bgn_tidur.*
class doaBgnTidur : AppCompatActivity() {
    private lateinit var tmblhome: ImageButton
    private lateinit var tmblSetting: ImageButton
    private lateinit var tmblback: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_bgn_tidur)
        tmblhome = findViewById(R.id.btn_home)
        tmblhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tmblSetting = findViewById(R.id.btn_setting)
        tmblSetting.setOnClickListener {
            val intent = Intent(this, setting::class.java)
            startActivity(intent)
        }
        tmblback = findViewById(R.id.btn_back)
        tmblback.setOnClickListener {
        }
        btn_back.setOnClickListener {
            this.finish()
        }
    }
}