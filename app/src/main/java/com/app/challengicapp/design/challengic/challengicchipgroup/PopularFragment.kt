package com.app.challengicapp.design.challengic.challengicchipgroup

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


class PopularFragment : Fragment() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        val popularrv = view.findViewById<RecyclerView>(R.id.popularrv)
        val populardatalist = listOf(
            ChallengicModel(R.drawable.p1, R.drawable.u2, "#picture #loading"),

            ChallengicModel(R.drawable.p2, R.drawable.u1, "#picoftheday #like #nature"),
            ChallengicModel(R.drawable.p3, R.drawable.u2, "#naturephotography #beauty "),
            ChallengicModel(
                R.drawable.p4,
                R.drawable.result_user_profile1,
                "#rainleaf #photoshoot"
            ),
            ChallengicModel(
                R.drawable.p5,
                R.drawable.result_user_profile2,
                "#smiley #smileeveryday #art"
            ),
            ChallengicModel(
                R.drawable.p6,
                R.drawable.result_user_profile1,
                "#cartoon #characterdesign"
            ),
            ChallengicModel(R.drawable.p7, R.drawable.u2, "#naturecaptures #photography")
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        popularrv.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), populardatalist)
        popularrv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}