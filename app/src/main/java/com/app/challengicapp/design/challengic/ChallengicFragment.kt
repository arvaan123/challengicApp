package com.app.challengicapp.design.challengic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.chip.*
import com.app.challengicapp.design.laderboard.LaderboardFragment
import com.app.challengicapp.design.userprofile.UserFragment
import com.google.android.material.chip.Chip


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
            val DanceFrag = DanceFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, DanceFrag).commit()

        }

        val popularChip = view.findViewById<Chip>(R.id.popularChip)
        popularChip.setOnClickListener {
            val popularFrag = PopularFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, popularFrag).commit()
        }

        val sportsChip = view.findViewById<Chip>(R.id.sportsChip)
        sportsChip.setOnClickListener {
            val sportsFrag = SportsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, sportsFrag).commit()
        }

        val singChip = view.findViewById<Chip>(R.id.singChip)
        singChip.setOnClickListener {
            val SingFrag = SingFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, SingFrag).commit()
        }

        val liveChip = view.findViewById<Chip>(R.id.liveChip)
        liveChip.setOnClickListener {
            val LiveFrag = LiveFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, LiveFrag).commit()
        }

        val allChip = view.findViewById<Chip>(R.id.allChip)
        allChip.setOnClickListener {
            val AllFrag = AllFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.ChipFrag, AllFrag).commit()
        }

        val DanceFrag = DanceFragment()
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.ChipFrag, DanceFrag).commit()


        val user_iv = view.findViewById<ImageView>(R.id.user_iv)
        user_iv.setOnClickListener {
            val userFrag = UserFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()

        }

        return view

    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


    }

}