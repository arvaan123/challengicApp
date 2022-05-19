package com.app.challengicapp.design.userprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R

class UserFollowingFragment : Fragment() {

    val data = listOf(
        UserFollowModel(R.drawable.u1, R.drawable.cf3, "Tina", "1367 votes"),
        UserFollowModel(R.drawable.user_profile, R.drawable.cf2, "Miller", "1298 votes"),
        UserFollowModel(R.drawable.u2, R.drawable.cf7, "Kai", "1088 votes"),
        UserFollowModel(
            R.drawable.result_user_profile1,
            R.drawable.cf4,
            "Matt",
            "953 votes"
        ),
        UserFollowModel(
            R.drawable.result_user_profile2,
            R.drawable.cf8,
            "Domi",
            "777 votes"
        ),
        UserFollowModel(R.drawable.u2, R.drawable.cf6, "Ade", "554 votes"),
        UserFollowModel(R.drawable.u1, R.drawable.cf1, "Kia", "398 votes"),
        UserFollowModel(
            R.drawable.result_user_profile2,
            R.drawable.cf5,
            "Lulia",
            "340 votes"
        ),
        UserFollowModel(
            R.drawable.result_user_profile1,
            R.drawable.cf1,
            "Marshall",
            "274 votes"
        ),
        UserFollowModel(R.drawable.u1, R.drawable.cf7, "Larisa", "105 votes")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_user_following, container, false)

        val followingrv = view.findViewById<RecyclerView>(R.id.followingrv)
        followingrv.setHasFixedSize(false)
        followingrv.layoutManager = LinearLayoutManager(requireActivity())
        followingrv.adapter = UserFollowingAdap(requireActivity(), data)

        return view
    }

}