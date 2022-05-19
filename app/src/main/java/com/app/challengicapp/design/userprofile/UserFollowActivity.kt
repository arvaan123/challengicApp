package com.app.challengicapp.design.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicFragment
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class UserFollowActivity : AppCompatActivity() {

    lateinit var bottomNavigation: BottomNavigationView

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_follow)

        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        val adapter = UserViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(UserFollowingFragment(), "336 following")
        adapter.addFragment(UserFollowersFragment(), "1078 followers")

        pager.adapter = adapter

        tab.setupWithViewPager(pager)

        bottomNavigation = findViewById(R.id.bottomNavigation) as BottomNavigationView


/*
        bottomNavigation.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.laderboard -> {
                    val laderboard = LaderboardFragment()
                    val FragTrans1 = supportFragmentManager.beginTransaction()
                    FragTrans1.replace(R.id.container, laderboard, "")
                    FragTrans1.commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.challengic -> {
                    val challengic = ChallengicFragment()
                    val FragTrans2 = supportFragmentManager.beginTransaction()
                    FragTrans2.replace(R.id.container, challengic, "")
                    FragTrans2.commit()
                    return@OnNavigationItemSelectedListener true

                }
                R.id.search -> {
                    val search = SearchFragment()
                    val FragTrans3 = supportFragmentManager.beginTransaction()
                    FragTrans3.replace(R.id.container, search, "")
                    FragTrans3.commit()
                    return@OnNavigationItemSelectedListener true

                }
            }
            false
        })
*/

        bottomNavigation.setSelectedItemId(R.id.challengic);

    }
}