package com.app.challengicapp.design.userprofile.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R
import com.google.android.material.bottomsheet.BottomSheetDialog


class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val tvChangeProfile = findViewById<TextView>(R.id.tvChangeProfile)
        tvChangeProfile.setOnClickListener {
            showBottomSheetDialog()
        }

        val tvCancel = findViewById<TextView>(R.id.tvCancel)
        tvCancel.setOnClickListener {
            finish()
        }
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_change_profile)

        bottomSheetDialog.show()
    }
}