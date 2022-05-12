package com.app.challengicapp.design.forgotpasswordsecond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.challengicapp.R
import com.app.challengicapp.design.backtologin.BackToLogIn
import com.app.challengicapp.design.login.LoginActivity

class ForgotPasswordSecondActivity : AppCompatActivity() {

    lateinit var tvFpsSubmit: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_second)

        tvFpsSubmit = findViewById(R.id.tvFpsSubmit)
        tvFpsSubmit.setOnClickListener {
            startActivity(Intent(this, BackToLogIn::class.java))
        }

    }
}