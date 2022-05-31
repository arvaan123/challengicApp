package com.app.challengicapp.design.backtologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.challengicapp.R
import com.app.challengicapp.design.login.LoginActivity

class BackToLogIn : AppCompatActivity() { 

    lateinit var tvBacktoLogin: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_to_log_in)

        tvBacktoLogin = findViewById(R.id.tvBacktoLogin)
        tvBacktoLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}