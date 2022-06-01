package com.app.challengicapp.design.userprofile.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.adapter.UserViewPagerAdapter
import com.app.challengicapp.design.userprofile.userfollowers.UserFollowersFragment
import com.app.challengicapp.design.userprofile.userfollowing.UserFollowingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout


class UserFollowFragment : Fragment() {
    lateinit var bottomNavigation: BottomNavigationView
    lateinit var backiv: ImageView

    private lateinit var uFollowPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_user_follow, container, false)

        uFollowPager = view.findViewById(R.id.vpUserFollow)
        tabLayout = view.findViewById(R.id.tabLayout)
        backiv = view.findViewById(R.id.ivUserBack)

        backiv.setOnClickListener {
            requireActivity().finish()
        }

        val userViewPagerAdapter = UserViewPagerAdapter(requireActivity().supportFragmentManager)

        userViewPagerAdapter.addFragment(UserFollowingFragment(), "336 following")
        userViewPagerAdapter.addFragment(UserFollowersFragment(), "1078 followers")

        uFollowPager.adapter = userViewPagerAdapter

        tabLayout.setupWithViewPager(uFollowPager)

        /*     bottomNavigation = view.findViewById(R.id.bottomNavigation) as BottomNavigationView


             bottomNavigation.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
                 when (item.itemId) {

                     R.id.laderboard -> {
                         val laderboard = LaderboardFragment()
                         val FragTrans1 = requireActivity().supportFragmentManager.beginTransaction()
                         FragTrans1.replace(R.id.userfollowfrag, laderboard, "")
                         FragTrans1.commit()
                         return@OnNavigationItemSelectedListener true
                     }
                     R.id.challengic -> {
                         val challengic = ChallengicFragment()
                         val FragTrans2 = requireActivity().supportFragmentManager.beginTransaction()
                         FragTrans2.replace(R.id.userfollowfrag, challengic, "")
                         FragTrans2.commit()
                         return@OnNavigationItemSelectedListener true

                     }
                     R.id.search -> {
                         val search = SearchFragment()
                         val FragTrans3 = requireActivity().supportFragmentManager.beginTransaction()
                         FragTrans3.replace(R.id.userfollowfrag, search, "")
                         FragTrans3.commit()
                         return@OnNavigationItemSelectedListener true

                     }
                 }
                 false
             })

             bottomNavigation.setSelectedItemId(R.id.challengic);
     */
        return view
    }

}