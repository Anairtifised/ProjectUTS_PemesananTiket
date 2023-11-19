package com.desinabila.projectuts_desinabila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_login = findViewById<Button>(R.id.btnLogin)
        var password = findViewById(R.id.passwords) as EditText
        var username = findViewById(R.id.Emasis) as com.google.android.material.textfield.TextInputEditText

        btn_login.setOnClickListener{
            if (username.text.toString().trim().isNotEmpty() && password.text.toString().trim().isNotEmpty()){
                startActivity(Intent(this, PesanTravelActivity::class.java))
            } else{
                Toast.makeText(applicationContext, "Masukkan Username dan Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}