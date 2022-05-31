package com.app.challengicapp.design.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.challengicapp.R
import com.app.challengicapp.design.login.LoginActivity

class SignUpSecondAct : AppCompatActivity() { 

    lateinit var tvContinue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_second)

        tvContinue=findViewById(R.id.tvContinue)
        tvContinue.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))

        }
    }
}