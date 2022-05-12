package com.app.challengicapp.design.signup

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R
import com.app.challengicapp.design.login.LoginActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var etSignUpPassword: EditText
    private lateinit var ivSignUpHidePassword: ImageView
    private lateinit var tvSignUpButtonLogin: TextView
    private lateinit var tv_backtologin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etSignUpPassword = findViewById(R.id.etSignUpPassword)
        ivSignUpHidePassword = findViewById(R.id.ivSignUpHidePassword)
        onClickListener()

        tvSignUpButtonLogin = findViewById(R.id.tvContinue)
        tvSignUpButtonLogin.setOnClickListener {
            startActivity(Intent(this, SignUpSecondAct::class.java))

        }

        tv_backtologin=findViewById(R.id.tv_backtologin)
        tv_backtologin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))

        }
    }

    private fun onClickListener() {
        ivSignUpHidePassword.setOnClickListener {
            if (etSignUpPassword.transformationMethod.equals(PasswordTransformationMethod.getInstance())) {
                ivSignUpHidePassword.setImageResource(R.drawable.ic_hide_password)
                //Show Password
                etSignUpPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
            } else {
                ivSignUpHidePassword.setImageResource(R.drawable.ic_show_password)
                //Hide Password
                etSignUpPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }
}