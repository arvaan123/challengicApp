package com.app.challengicapp.design.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.adapter.PostAdap
import com.app.challengicapp.design.model.PostModel
import com.app.challengicapp.design.userprofile.EditProfile
import com.google.android.material.bottomsheet.BottomSheetDialog

class User_frag : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.user_post_rv)
        val data = listOf(
            PostModel(R.drawable.m1, R.drawable.u1, "#musicnotes #music"),
            PostModel(R.drawable.m2, R.drawable.u2, "#headphones #lyrics"),
            PostModel(R.drawable.m3, R.drawable.result_user_profile2, "#music #classical #igmusic"),
            PostModel(R.drawable.m4, R.drawable.result_user_profile1, "#singing #classicalmusic"),
            PostModel(R.drawable.m5, R.drawable.u2, "#musician #radio"),
            PostModel(R.drawable.m6, R.drawable.u1, "#guitar #music")
        )


        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.setLayoutManager(layoutManager)
        val adapter = PostAdap(requireActivity(), data)
        recyclerview.adapter = adapter

        val iv_more = view.findViewById<ImageView>(R.id.iv_more)
        iv_more.setOnClickListener {

            showBottomSheetDialog()
        }

        return view
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(requireActivity())
        bottomSheetDialog.setContentView(R.layout.bottom_profile_option)

        val ll_edit_profile = bottomSheetDialog.findViewById<LinearLayout>(R.id.ll_edit_profile)

        ll_edit_profile?.setOnClickListener {
            startActivity(Intent(requireActivity(), EditProfile::class.java))

        }

        bottomSheetDialog.show()
    }

}