package com.app.challengicapp.design.userprofile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.adapter.PostAdap
import com.app.challengicapp.design.model.PostModel
import com.google.android.material.bottomsheet.BottomSheetDialog


class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val recyclerview = findViewById<RecyclerView>(R.id.user_post_rv)
        val data = listOf(
            PostModel(R.drawable.m1, R.drawable.l1, "#musicnotes #music"),
            PostModel(R.drawable.m2, R.drawable.l2, "#headphones #lyrics"),
            PostModel(R.drawable.m3, R.drawable.l3, "#music #classical #igmusic"),
            PostModel(R.drawable.m4, R.drawable.l4, "#singing #classicalmusic"),
            PostModel(R.drawable.m5, R.drawable.l5, "#musician #radio"),
            PostModel(R.drawable.m6, R.drawable.l1, "#guitar #music")
        )


        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.setLayoutManager(layoutManager)
        val adapter = PostAdap(this, data)
        recyclerview.adapter = adapter

        val iv_more = findViewById<ImageView>(R.id.iv_more)
        iv_more.setOnClickListener {

            showBottomSheetDialog()
        }

    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bottom_profile_option)

        val ll_edit_profile = bottomSheetDialog.findViewById<LinearLayout>(R.id.ll_edit_profile)

        ll_edit_profile?.setOnClickListener {
            startActivity(Intent(this, EditProfile::class.java))

        }

        bottomSheetDialog.show()
    }

}