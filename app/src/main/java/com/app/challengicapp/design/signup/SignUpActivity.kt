package com.app.challengicapp.design.signup

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var etSignUpPassword: EditText
    private lateinit var ivSignUpHidePassword: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etSignUpPassword = findViewById(R.id.etSignUpPassword)
        ivSignUpHidePassword = findViewById(R.id.ivSignUpHidePassword)
        onClickListener()
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