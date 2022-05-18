package com.app.challengicapp.design.chip

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

class DanceFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_dance, container, false)

        val dancerv = view.findViewById<RecyclerView>(R.id.dancerv)
        val dancedatalist = listOf(
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
            )
        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        dancerv.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), dancedatalist)
        dancerv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}