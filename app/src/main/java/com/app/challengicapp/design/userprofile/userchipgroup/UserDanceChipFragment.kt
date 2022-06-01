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

class UserDanceChipFragment : Fragment() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_dance_chip, container, false)

        val uDanceRv = view.findViewById<RecyclerView>(R.id.rvUserDance)
        val danceDataList = listOf(
            UserVideoOptionModel(R.drawable.d5, R.drawable.u2, "#indiandance #art #classical"),

            UserVideoOptionModel(
                R.drawable.d1,
                R.drawable.u1,
                "#dancestudio #dancetime #hiphopdance"
            ),
            UserVideoOptionModel(R.drawable.d2, R.drawable.u2, "#dancing #dj #trending"),
            UserVideoOptionModel(
                R.drawable.d4,
                R.drawable.result_user_profile1,
                "#indianclassicaldance #bharatanatyam"
            ),
            UserVideoOptionModel(
                R.drawable.d3,
                R.drawable.result_user_profile2,
                "#dancechallenge #zumbadance"
            ),
            UserVideoOptionModel(
                R.drawable.d7,
                R.drawable.result_user_profile1,
                "#dancerslife  #postperformance #stagelife"
            ),
            UserVideoOptionModel(R.drawable.d8, R.drawable.u2, "#dancehall #talent"),
            UserVideoOptionModel(R.drawable.d6, R.drawable.u1, "#dancersofindia #performance"),

//            PostModel(
//                R.drawable.d9,
//                R.drawable.result_user_profile2,
//                "#dancecover #dancephotography "
//            ),
            UserVideoOptionModel(
                R.drawable.d10,
                R.drawable.result_user_profile2,
                "#dancersofindia #internationaldanceday"
            )
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        uDanceRv.setLayoutManager(layoutManager)
        val userVideoOptionAdap = UserVideoOptionAdap(requireActivity(), danceDataList)
        uDanceRv.adapter = userVideoOptionAdap
        userVideoOptionAdap.notifyDataSetChanged()

        return view
    }

}