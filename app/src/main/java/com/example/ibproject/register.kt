package com.example.ibproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class register : AppCompatActivity() {
    private lateinit var aut: FirebaseAuth
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        aut = FirebaseAuth.getInstance()
        val btnSign: Button = findViewById(R.id.btnregis)
        val btnLog: Button = findViewById(R.id.btnLoginn)

        btnSign.setOnClickListener {
            email = findViewById(R.id.etEmailReg)
            val emaill = email.text.toString().trim()
            password = findViewById(R.id.etPasswordReg)
            val pasw = password.text.toString().trim()

            if (emaill.isEmpty()) {
                email.error ="Email Harus Diisi"
                email.requestFocus()
                return@setOnClickListener
            }

            if (pasw.isEmpty()) {
                password.error ="Password Email Harus Diisi"
                password.requestFocus()
                return@setOnClickListener
            }
            registerUser(emaill, pasw)
        }


    }

    private fun registerUser(emaill: String, pasw: String) {
        aut.createUserWithEmailAndPassword(emaill, pasw)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "email berhasil dibuat", Toast.LENGTH_SHORT).show()
                    Intent(this, MainActivity::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                        startActivity(it)
                    }
                }else{
                    Toast.makeText(this, it.exception?.message, Toast.LENGTH_SHORT).show()
                }
            }
    }
}