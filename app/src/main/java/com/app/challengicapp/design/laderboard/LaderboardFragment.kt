package com.app.challengicapp.design.laderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R

class LaderboardFragment : Fragment() {

    val laderboardDataList = listOf(
        LaderboardModel(R.drawable.u1, R.drawable.cf3, "Tina", "1367 votes", "1st"),
        LaderboardModel(R.drawable.user_profile, R.drawable.cf2, "Miller", "1298 votes", "2nd"),
        LaderboardModel(R.drawable.u2, R.drawable.cf7, "Kai", "1088 votes", "3rd"),
        LaderboardModel(
            R.drawable.result_user_profile1,
            R.drawable.cf4,
            "Matt",
            "953 votes",
            "4th"
        ),
        LaderboardModel(
            R.drawable.result_user_profile2,
            R.drawable.cf8,
            "Domi",
            "777 votes",
            "5th"
        ),
        LaderboardModel(R.drawable.u2, R.drawable.cf6, "Ade", "554 votes", "6th"),
        LaderboardModel(R.drawable.u1, R.drawable.cf1, "Kia", "398 votes", "7th"),
        LaderboardModel(
            R.drawable.result_user_profile2,
            R.drawable.cf5,
            "Lulia",
            "340 votes",
            "8th"
        ),
        LaderboardModel(
            R.drawable.result_user_profile1,
            R.drawable.cf1,
            "Marshall",
            "274 votes",
            "9th"
        ),
        LaderboardModel(R.drawable.u1, R.drawable.cf7, "Larisa", "105 votes", "10th")
    )

    fun Laderboard_frag() {
        // Required empty public constructor

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_laderboard, container, false)

        val rvLaderboard = view.findViewById<RecyclerView>(R.id.rvLaderboard)
        rvLaderboard.setHasFixedSize(false)
        rvLaderboard.layoutManager = LinearLayoutManager(requireActivity())

        val laderboardAdap = LaderboardAdap(requireActivity(), laderboardDataList,nevigateToResultFragmentListener)
        rvLaderboard.adapter = laderboardAdap
        laderboardAdap.notifyDataSetChanged()

        val backIv = view.findViewById<ImageView>(R.id.ivUserBack)
        backIv.setOnClickListener {
            requireActivity().finish()
        }

        return view
    }

    val nevigateToResultFragmentListener = fun(){
        findNavController().navigate(R.id.action_laderboard_to_resultFragment);

    }

}