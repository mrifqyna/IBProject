package com.example.ibproject

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_doa_nabi.*
class DoaNabi : AppCompatActivity() {
    private lateinit var tmbldoaIbrahim : ImageView
    private lateinit var tmbldoaNuh : ImageView
    private lateinit var tmbldoaAdam : ImageView
    private lateinit var tmbldoaMuhammad : ImageView

    private lateinit var tmblhome : ImageView
    private lateinit var tmblsetting: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_nabi)

        tmbldoaIbrahim = findViewById(R.id.btnDibrahim)
        tmbldoaIbrahim.setOnClickListener {
            val intent = Intent(this,doaNabiIbrahim::class.java)
            startActivity(intent)
        }
        tmbldoaAdam = findViewById(R.id.btnDadam)
        tmbldoaAdam.setOnClickListener {
            val intent = Intent(this,doaNabiAdam::class.java)
            startActivity(intent)
        }
        tmbldoaNuh = findViewById(R.id.btnDnuh)
        tmbldoaNuh.setOnClickListener {
            val intent = Intent(this,doaNabiNuh::class.java)
            startActivity(intent)
        }
        tmbldoaMuhammad = findViewById(R.id.btnDrasul)
        tmbldoaMuhammad.setOnClickListener {
            val intent = Intent(this,doaNabiMuhammad::class.java)
            startActivity(intent)
        }
        tmblhome = findViewById(R.id.btn_home)
        tmblhome.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        tmblsetting = findViewById(R.id.btn_setting)
        tmblsetting.setOnClickListener {
            val intent = Intent(this,setting::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            this.finish()
        }
    }
}