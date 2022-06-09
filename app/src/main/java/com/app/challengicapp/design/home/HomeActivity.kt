package com.app.challengicapp.design.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicFragment
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() { 

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav = findViewById(R.id.bottomNav)

        val navController = findNavController(R.id.container)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.laderboard, R.id.challengic, R.id.search
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNav.setupWithNavController(navController)

       /* val laderBoardFrag = LaderboardFragment()
        val FragTrans = supportFragmentManager.beginTransaction()
        FragTrans.replace(R.id.container, laderBoardFrag, "")
        FragTrans.commit()*/


        bottomNav.setOnItemSelectedListener{
            when (it.itemId) {

                R.id.laderboard -> {
                    findNavController(R.id.container).navigate(R.id.laderboard);
                }

                R.id.challengic -> {
                    findNavController(R.id.container).navigate(R.id.challengic);
                }

                R.id.search -> {
                    findNavController(R.id.container).navigate(R.id.search);
                }
            }
            false
        }
    }

/*
    override fun onBackPressed() {
        finish()
    }
*/

}