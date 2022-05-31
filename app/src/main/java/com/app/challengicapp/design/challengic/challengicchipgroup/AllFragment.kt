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

class AllFragment : Fragment() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_all, container, false)

        val rvAll = view.findViewById<RecyclerView>(R.id.rvAll)
        val allDataList = listOf(
            ChallengicModel(R.drawable.d5, R.drawable.u2, "#indiandance #art #classical"),

            ChallengicModel(R.drawable.d1, R.drawable.u1, "#dancestudio #dancetime #hiphopdance"),
            ChallengicModel(R.drawable.d2, R.drawable.u2, "#dancing #dj #trending"),
            ChallengicModel(
                R.drawable.d4,
                R.drawable.result_user_profile1,
                "#indianclassicaldance #bharatanatyam"
            ),
            ChallengicModel(
                R.drawable.d3,
                R.drawable.result_user_profile2,
                "#dancechallenge #zumbadance"
            ),
            ChallengicModel(
                R.drawable.d7,
                R.drawable.result_user_profile1,
                "#dancerslife  #postperformance #stagelife"
            ),
            ChallengicModel(R.drawable.d8, R.drawable.u2, "#dancehall #talent"),
            ChallengicModel(R.drawable.d6, R.drawable.u1, "#dancersofindia #performance"),

//            PostModel(
//                R.drawable.d9,
//                R.drawable.result_user_profile2,
//                "#dancecover #dancephotography "
//            ),
            ChallengicModel(
                R.drawable.d10,
                R.drawable.result_user_profile2,
                "#dancersofindia #internationaldanceday"
            ),
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
            ChallengicModel(R.drawable.p7, R.drawable.u2, "#naturecaptures #photography"),
            ChallengicModel(R.drawable.s1, R.drawable.u2, "#sports #follow #cricket"),

            ChallengicModel(R.drawable.s2, R.drawable.u1, "#sport #fitness #like "),
            ChallengicModel(R.drawable.s3, R.drawable.u2, "#volleyballteam #volleyballplayers"),
            ChallengicModel(
                R.drawable.s4,
                R.drawable.result_user_profile1,
                "#sportsblog #football #sportslife"
            ),
            ChallengicModel(
                R.drawable.s5,
                R.drawable.result_user_profile2,
                "#indiancricket #cricketfans "
            ),
            ChallengicModel(
                R.drawable.s6,
                R.drawable.result_user_profile1,
                "#sportsperformance #badmintonplayer "
            ),
            ChallengicModel(R.drawable.s7, R.drawable.u2, "#sports #basketball "),
            ChallengicModel(R.drawable.s8, R.drawable.u1, "#footballplayer #footballer"),

            ChallengicModel(
                R.drawable.s9,
                R.drawable.result_user_profile2,
                "#sportsphotography #badmintontrickshot"
            ),
            ChallengicModel(R.drawable.m1, R.drawable.u1, "#musicnotes #music"),
            ChallengicModel(R.drawable.m2, R.drawable.u2, "#headphones #lyrics"),
            ChallengicModel(R.drawable.m7, R.drawable.result_user_profile2, "#music #igmusic"),
            ChallengicModel(
                R.drawable.m4,
                R.drawable.result_user_profile1,
                "#singing #classicalmusic"
            ),
            ChallengicModel(R.drawable.m8, R.drawable.u2, "#musician #singing #concert #livemusic"),
            ChallengicModel(R.drawable.m6, R.drawable.u1, "#guitar #music"),
            ChallengicModel(R.drawable.m9, R.drawable.result_user_profile1, "#violin #music"),
            ChallengicModel(R.drawable.m3, R.drawable.result_user_profile2, "#musical #musiclife"),
            ChallengicModel(R.drawable.m5, R.drawable.u2, "#music #notes"),
            ChallengicModel(R.drawable.l1, R.drawable.u1, "#live #photography"),
            ChallengicModel(R.drawable.l2, R.drawable.u2, "#enjoylife #enjoythemoment "),
            ChallengicModel(
                R.drawable.l3,
                R.drawable.result_user_profile2,
                "#naturephotography #flowers #naturebeauty"
            ),
            ChallengicModel(
                R.drawable.l4,
                R.drawable.result_user_profile1,
                "#like #instadaily"
            ),
            ChallengicModel(R.drawable.l6, R.drawable.u1, "#flower_daily #flora #nature"),

            ChallengicModel(R.drawable.l5, R.drawable.u2, "#creativity #design #photography")

        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvAll.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), allDataList)
        rvAll.adapter = adapter
        adapter.notifyDataSetChanged()
        //adapter.notifyItemChanged(0)

        return view
    }
}