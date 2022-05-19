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

class SingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_sing, container, false)

        val singrv = view.findViewById<RecyclerView>(R.id.singrv)
        val singdatalist = listOf(
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
            ChallengicModel(R.drawable.m5, R.drawable.u2, "#music #notes")

        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        singrv.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), singdatalist)
        singrv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}