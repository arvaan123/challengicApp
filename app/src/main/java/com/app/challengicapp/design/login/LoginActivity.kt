package com.app.challengicapp.design.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.challengicapp.R
import com.app.challengicapp.design.forgotpassword.ForgotPasswordActivity
import com.app.challengicapp.design.signup.SignUpActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var tvLoginRegisterNow:TextView
    private lateinit var tvLoginForgotPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvLoginRegisterNow=findViewById(R.id.tvLoginRegisterNow)
        tvLoginForgotPassword=findViewById(R.id.tvLoginForgotPassword)

        tvLoginRegisterNow.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        tvLoginForgotPassword.setOnClickListener {
            startActivity(Intent(this,ForgotPasswordActivity::class.java))
        }
    }
}