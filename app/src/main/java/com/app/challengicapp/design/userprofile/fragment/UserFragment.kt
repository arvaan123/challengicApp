package com.app.challengicapp.design.userprofile.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.activity.EditProfileActivity
import com.app.challengicapp.design.userprofile.userchipgroup.UserDanceChipFragment
import com.app.challengicapp.design.userprofile.userchipgroup.UserPopularChipFragment
import com.app.challengicapp.design.userprofile.userchipgroup.UserSingChipFragment
import com.app.challengicapp.design.userprofile.userchipgroup.UserSportsChipFragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.chip.Chip


class UserFragment : Fragment() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        val uDanceFrag = UserDanceChipFragment()
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.userChipFrag, uDanceFrag).commit()

        val ivMore = view.findViewById<ImageView>(R.id.ivMore)
        ivMore.setOnClickListener {
            showBottomSheetDialog()
        }

        //chip
        val danceChip = view.findViewById<Chip>(R.id.danceChip)
        danceChip.setOnClickListener {
            val uDanceFrag = UserDanceChipFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, uDanceFrag).commit()
        }

        val popularChip = view.findViewById<Chip>(R.id.popularChip)
        popularChip.setOnClickListener {
            val popularFrag = UserPopularChipFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, popularFrag).commit()
        }

        val sportsChip = view.findViewById<Chip>(R.id.sportsChip)
        sportsChip.setOnClickListener {
            val sportsFrag = UserSportsChipFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, sportsFrag).commit()
        }

        val singChip = view.findViewById<Chip>(R.id.singChip)
        singChip.setOnClickListener {
            val singFrag = UserSingChipFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, singFrag).commit()
        }

        val llFollowing = view.findViewById<LinearLayout>(R.id.llFollowing)
        llFollowing.setOnClickListener {
            //  startActivity(Intent(requireActivity(), UserFollowActivity::class.java))

            val userFrag = UserFollowFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()
        }

        val llFollowers = view.findViewById<LinearLayout>(R.id.llFollowers)
        llFollowers.setOnClickListener {
            // startActivity(Intent(requireActivity(), UserFollowActivity::class.java))

            val userFrag = UserFollowFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()
        }


        val ivclose = view.findViewById<ImageView>(R.id.ivClose)
        ivclose.setOnClickListener {
           // startActivity(Intent(requireActivity(), HomeActivity::class.java))

            requireActivity().finish()
        }
        return view
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(requireActivity())
        bottomSheetDialog.setContentView(R.layout.bottom_profile_option)

        val llEditProfile = bottomSheetDialog.findViewById<LinearLayout>(R.id.llEditProfile)

        llEditProfile?.setOnClickListener {
            startActivity(Intent(requireActivity(), EditProfileActivity::class.java))

        }

        bottomSheetDialog.show()
    }

}