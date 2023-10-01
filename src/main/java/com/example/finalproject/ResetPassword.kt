package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ResetPassword : AppCompatActivity() {

    private lateinit var newPassword : EditText
    private lateinit var confirmPassword : EditText
    private lateinit var enterPIN : EditText
    private lateinit var resetPassword : Button
    private lateinit var backButton : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)


        newPassword = findViewById(R.id.et_username)
        confirmPassword = findViewById(R.id.et_confirmPassword)
        enterPIN = findViewById(R.id.et_enterPIN)
        resetPassword = findViewById(R.id.bt_resetPassword)


        resetPassword.setOnClickListener{
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }




    }
}