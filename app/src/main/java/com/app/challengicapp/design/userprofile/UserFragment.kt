package com.app.challengicapp.design.userprofile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.app.challengicapp.R
import com.app.challengicapp.design.chip.DanceFragment
import com.app.challengicapp.design.chip.PopularFragment
import com.app.challengicapp.design.chip.SingFragment
import com.app.challengicapp.design.chip.SportsFragment
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


        val iv_more = view.findViewById<ImageView>(R.id.iv_more)
        iv_more.setOnClickListener {

            showBottomSheetDialog()
        }

        val danceChip = view.findViewById<Chip>(R.id.danceChip)
        danceChip.setOnClickListener {
            val DanceFrag = DanceFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, DanceFrag).commit()
        }

        val popularChip = view.findViewById<Chip>(R.id.popularChip)
        popularChip.setOnClickListener {
            val popularFrag = PopularFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, popularFrag).commit()
        }

        val sportsChip = view.findViewById<Chip>(R.id.sportsChip)
        sportsChip.setOnClickListener {
            val sportsFrag = SportsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, sportsFrag).commit()
        }

        val singChip = view.findViewById<Chip>(R.id.singChip)
        singChip.setOnClickListener {
            val SingFrag = SingFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.userChipFrag, SingFrag).commit()
        }

        val DanceFrag = DanceFragment()
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.userChipFrag, DanceFrag).addToBackStack(null).commit()

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