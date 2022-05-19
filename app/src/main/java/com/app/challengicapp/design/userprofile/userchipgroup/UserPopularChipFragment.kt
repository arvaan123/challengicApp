package com.app.challengicapp.design.userprofile.userchipgroup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicAdap
import com.app.challengicapp.design.challengic.ChallengicModel
import com.app.challengicapp.design.userprofile.UserVideoOptionAdap
import com.app.challengicapp.design.userprofile.UserVideoOptionModel

class UserPopularChipFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_popular_chip, container, false)

        val upopularrv = view.findViewById<RecyclerView>(R.id.upopularrv)
        val populardatalist = listOf(
            UserVideoOptionModel(R.drawable.p1, R.drawable.u2, "#picture #loading"),

            UserVideoOptionModel(R.drawable.p2, R.drawable.u1, "#picoftheday #like #nature"),
            UserVideoOptionModel(R.drawable.p3, R.drawable.u2, "#naturephotography #beauty "),
            UserVideoOptionModel(
                R.drawable.p4,
                R.drawable.result_user_profile1,
                "#rainleaf #photoshoot"
            ),
            UserVideoOptionModel(
                R.drawable.p5,
                R.drawable.result_user_profile2,
                "#smiley #smileeveryday #art"
            ),
            UserVideoOptionModel(
                R.drawable.p6,
                R.drawable.result_user_profile1,
                "#cartoon #characterdesign"
            ),
            UserVideoOptionModel(R.drawable.p7, R.drawable.u2, "#naturecaptures #photography")
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        upopularrv.setLayoutManager(layoutManager)
        val adapter = UserVideoOptionAdap(requireActivity(), populardatalist)
        upopularrv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }
}