package com.app.challengicapp.design.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicFragment
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // loadFragment(Laderboard_frag())
        val fragment2 = LaderboardFragment()
        val fragmentTransaction2 = supportFragmentManager.beginTransaction()
        fragmentTransaction2.replace(R.id.container, fragment2, "")
        fragmentTransaction2.commit()

        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.laderboard -> {
                    val laderboard = LaderboardFragment()
                    val frag_trans1 = supportFragmentManager.beginTransaction()
                    frag_trans1.replace(R.id.container, laderboard, "")
                    frag_trans1.commit()
                    return@setOnNavigationItemReselectedListener
                    true
                }
                R.id.add_post -> {
                    val add_post = ChallengicFragment()
                    val frag_trans2 = supportFragmentManager.beginTransaction()
                    frag_trans2.replace(R.id.container, add_post, "")
                    frag_trans2.commit()
                    return@setOnNavigationItemReselectedListener
                    true
                }
                R.id.search -> {
                    val search = SearchFragment()
                    val frag_trans3 = supportFragmentManager.beginTransaction()
                    frag_trans3.replace(R.id.container, search, "")
                    frag_trans3.commit()
                    return@setOnNavigationItemReselectedListener
                    true
                }
            }
        }
    }
}