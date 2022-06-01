package com.app.challengicapp.design.userprofile.userchipgroup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.adapter.UserVideoOptionAdap
import com.app.challengicapp.design.userprofile.modelclass.UserVideoOptionModel

class UserSportsChipFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_sports_chip, container, false)

        val uSportsRv = view.findViewById<RecyclerView>(R.id.rvUserChipSports)
        val sportsDataList = listOf(
            UserVideoOptionModel(R.drawable.s1, R.drawable.u2, "#sports #follow #cricket"),

            UserVideoOptionModel(R.drawable.s2, R.drawable.u1, "#sport #fitness #like "),
            UserVideoOptionModel(
                R.drawable.s3,
                R.drawable.u2,
                "#volleyballteam #volleyballplayers"
            ),
            UserVideoOptionModel(
                R.drawable.s4,
                R.drawable.result_user_profile1,
                "#sportsblog #football #sportslife"
            ),
            UserVideoOptionModel(
                R.drawable.s5,
                R.drawable.result_user_profile2,
                "#indiancricket #cricketfans "
            ),
            UserVideoOptionModel(
                R.drawable.s6,
                R.drawable.result_user_profile1,
                "#sportsperformance #badmintonplayer "
            ),
            UserVideoOptionModel(R.drawable.s7, R.drawable.u2, "#sports #basketball "),
            UserVideoOptionModel(R.drawable.s8, R.drawable.u1, "#footballplayer #footballer"),

            UserVideoOptionModel(
                R.drawable.s9,
                R.drawable.result_user_profile2,
                "#sportsphotography #badmintontrickshot"
            )
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        uSportsRv.setLayoutManager(layoutManager)
        val userVideoOptionAdap = UserVideoOptionAdap(requireActivity(), sportsDataList)
        uSportsRv.adapter = userVideoOptionAdap
        userVideoOptionAdap.notifyDataSetChanged()

        return view
    }

}