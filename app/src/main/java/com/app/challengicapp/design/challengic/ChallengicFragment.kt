package com.app.challengicapp.design.challengic

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.challengicchipgroup.*
import com.app.challengicapp.design.notification.NotificationActivity
import com.app.challengicapp.design.userprofile.fragment.UserFragment
import com.google.android.material.chip.Chip
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ChallengicFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_challengic, container, false)

        //chip

        val danceChip = view.findViewById<Chip>(R.id.danceChip)
        danceChip.setOnClickListener {
            val danceFrag = DanceFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, danceFrag).commit()

        }

        val popularChip = view.findViewById<Chip>(R.id.popularChip)
        popularChip.setOnClickListener {
            val popularFrag = PopularFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, popularFrag).commit()
        }

        val sportsChip = view.findViewById<Chip>(R.id.sportsChip)
        sportsChip.setOnClickListener {
            val sportsFrag = SportsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, sportsFrag).commit()
        }

        val singChip = view.findViewById<Chip>(R.id.singChip)
        singChip.setOnClickListener {
            val singFrag = SingFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, singFrag).commit()
        }

        val liveChip = view.findViewById<Chip>(R.id.liveChip)
        liveChip.setOnClickListener {
            val liveFrag = LiveFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, liveFrag).commit()
        }

        val allChip = view.findViewById<Chip>(R.id.allChip)
        allChip.setOnClickListener {
            val allFrag = AllFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chipFrag, allFrag).commit()
        }

        val DanceFrag = DanceFragment()
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.chipFrag, DanceFrag).commit()

        val userIv = view.findViewById<ImageView>(R.id.cIvUserProfile)
        userIv.setOnClickListener {
           /* val userFrag = UserFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()*/

            findNavController().navigate(R.id.action_challengic_to_userFragment);

          /*  val navHostFragment =
                requireActivity().supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
            val navController = navHostFragment.navController*/


        }

        val fabNotification = view.findViewById<FloatingActionButton>(R.id.fabNotification)
        fabNotification.setOnClickListener {
            startActivity(Intent(requireActivity(), NotificationActivity::class.java))
        }

        return view

    }



    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


    }

}