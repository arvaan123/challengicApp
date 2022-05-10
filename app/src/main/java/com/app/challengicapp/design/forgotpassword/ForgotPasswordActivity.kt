package com.app.challengicapp.design.forgotpassword

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R
import com.app.challengicapp.design.forgotpasswordsecond.ForgotPasswordSecondActivity
import com.app.challengicapp.design.login.LoginActivity

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var tvFpBackToLogin: TextView
    lateinit var tvFpSubmit: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        tvFpBackToLogin = findViewById(R.id.tvFpBackToLogin)
        tvFpSubmit = findViewById(R.id.tvFpSubmit)

        tvFpBackToLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        tvFpSubmit.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordSecondActivity::class.java))
        }
    }
}