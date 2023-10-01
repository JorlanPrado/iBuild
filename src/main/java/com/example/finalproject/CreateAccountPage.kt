package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateAccountPage : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var PIN : EditText
    private lateinit var createAccount : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        username = findViewById(R.id.et_username_createAccountPage)
        password = findViewById(R.id.et_password_createAccountPage)
        PIN = findViewById(R.id.et_PIN_createAccountPage)
        createAccount = findViewById(R.id.bt_createAccount)



        //DAPAT ITO MAPUPUNTA SA LANDING PAGE/HOMEPAGE
        createAccount.setOnClickListener {
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }

    }
}