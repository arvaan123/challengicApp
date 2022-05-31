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

class SportsFragment : Fragment() { 


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sports, container, false)

        val sportsrv = view.findViewById<RecyclerView>(R.id.sportsrv)
        val sportsdatalist = listOf(
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
            )
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        sportsrv.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), sportsdatalist)
        sportsrv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}