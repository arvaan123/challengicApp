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


class UserSingChipFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_sing_chip, container, false)

        val usingrv = view.findViewById<RecyclerView>(R.id.usingrv)
        val singdatalist = listOf(
            UserVideoOptionModel(R.drawable.m1, R.drawable.u1, "#musicnotes #music"),
            UserVideoOptionModel(R.drawable.m2, R.drawable.u2, "#headphones #lyrics"),
            UserVideoOptionModel(R.drawable.m7, R.drawable.result_user_profile2, "#music #igmusic"),
            UserVideoOptionModel(
                R.drawable.m4,
                R.drawable.result_user_profile1,
                "#singing #classicalmusic"
            ),
            UserVideoOptionModel(R.drawable.m8, R.drawable.u2, "#musician #singing #concert #livemusic"),
            UserVideoOptionModel(R.drawable.m6, R.drawable.u1, "#guitar #music"),
            UserVideoOptionModel(R.drawable.m9, R.drawable.result_user_profile1, "#violin #music"),
            UserVideoOptionModel(R.drawable.m3, R.drawable.result_user_profile2, "#musical #musiclife"),
            UserVideoOptionModel(R.drawable.m5, R.drawable.u2, "#music #notes")

        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        usingrv.setLayoutManager(layoutManager)
        val adapter = UserVideoOptionAdap(requireActivity(), singdatalist)
        usingrv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view    }
}