package com.app.challengicapp.design.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicFragment
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class HomeActivity : AppCompatActivity() { 

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val laderBoardFrag = LaderboardFragment()
        val FragTrans = supportFragmentManager.beginTransaction()
        FragTrans.replace(R.id.container, laderBoardFrag, "")
        FragTrans.commit()

        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener{
            when (it.itemId) {

                R.id.laderboard -> {
                    val laderboard = LaderboardFragment()
                    val FragTrans1 = supportFragmentManager.beginTransaction()
                    FragTrans1.replace(R.id.container, laderboard, "")
                    FragTrans1.commit()
                    return@setOnItemSelectedListener true
                }
                R.id.challengic -> {
                    val challengic = ChallengicFragment()
                    val FragTrans2 = supportFragmentManager.beginTransaction()
                    FragTrans2.replace(R.id.container, challengic, "")
                    FragTrans2.commit()
                    return@setOnItemSelectedListener true

                }
                R.id.search -> {
                    val search = SearchFragment()
                    val FragTrans3 = supportFragmentManager.beginTransaction()
                    FragTrans3.replace(R.id.container, search, "")
                    FragTrans3.commit()
                    return@setOnItemSelectedListener true

                }
            }
            false
        }
    }

    override fun onBackPressed() {
        finish()
    }

}