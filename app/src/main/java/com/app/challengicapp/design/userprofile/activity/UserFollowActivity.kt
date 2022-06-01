package com.app.challengicapp.design.userprofile.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.fragment.UserFollowFragment


class UserFollowActivity : AppCompatActivity() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_follow)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.userFollowFrag, UserFollowFragment()).commit()
    }

    override fun onBackPressed() {
        finish()
    }
}