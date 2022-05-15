package com.app.challengicapp.design.userprofile

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R
import com.google.android.material.bottomsheet.BottomSheetDialog


class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val tv_change_profile=findViewById<TextView>(R.id.tv_change_profile)
        tv_change_profile.setOnClickListener {
            showBottomSheetDialog()

        }
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_change_profile)

        bottomSheetDialog.show()
    }
}