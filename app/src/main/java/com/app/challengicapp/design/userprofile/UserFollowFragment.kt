package com.app.challengicapp.design.userprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicFragment
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout


class UserFollowFragment : Fragment() {
    lateinit var bottomNavigation: BottomNavigationView
    lateinit var backiv: ImageView

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_user_follow, container, false)

        pager = view.findViewById(R.id.viewPager)
        tab = view.findViewById(R.id.tabs)
        backiv = view.findViewById(R.id.backiv)

        backiv.setOnClickListener {
            requireActivity().finish()
        }

        val adapter = UserViewPagerAdapter(requireActivity().supportFragmentManager)

        adapter.addFragment(UserFollowingFragment(), "336 following")
        adapter.addFragment(UserFollowersFragment(), "1078 followers")

        pager.adapter = adapter

        tab.setupWithViewPager(pager)

      //  bottomNavigation = view.findViewById(R.id.bottomNavigation) as BottomNavigationView


//        bottomNavigation.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//
//                R.id.laderboard -> {
//                    val laderboard = LaderboardFragment()
//                    val FragTrans1 = requireActivity().supportFragmentManager.beginTransaction()
//                    FragTrans1.replace(R.id.userfollowfrag, laderboard, "")
//                    FragTrans1.commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.challengic -> {
//                    val challengic = ChallengicFragment()
//                    val FragTrans2 = requireActivity().supportFragmentManager.beginTransaction()
//                    FragTrans2.replace(R.id.userfollowfrag, challengic, "")
//                    FragTrans2.commit()
//                    return@OnNavigationItemSelectedListener true
//
//                }
//                R.id.search -> {
//                    val search = SearchFragment()
//                    val FragTrans3 = requireActivity().supportFragmentManager.beginTransaction()
//                    FragTrans3.replace(R.id.userfollowfrag, search, "")
//                    FragTrans3.commit()
//                    return@OnNavigationItemSelectedListener true
//
//                }
//            }
//            false
//        })

        //bottomNavigation.setSelectedItemId(R.id.challengic);

        return view
    }

}