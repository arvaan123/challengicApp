package com.app.challengicapp.design.challengic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.UserFragment


class ChallengicFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_challengic, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.post_rv)

        val data = listOf(
            ChallengicModel(R.drawable.m1, R.drawable.u2, "#musicnotes #music"),
            ChallengicModel(R.drawable.m2, R.drawable.u1, "#headphones #lyrics"),
            ChallengicModel(R.drawable.m3, R.drawable.result_user_profile1, "#music #classical #igmusic"),
            ChallengicModel(R.drawable.m4, R.drawable.result_user_profile2, "#singing #classicalmusic"),
            ChallengicModel(R.drawable.m5, R.drawable.u1, "#musician #radio"),
            ChallengicModel(R.drawable.m6, R.drawable.u2, "#guitar #music")
        )


        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), data)
        recyclerview.adapter = adapter

        val user_iv = view.findViewById<ImageView>(R.id.user_iv)
        user_iv.setOnClickListener {
//            val intent = Intent(requireActivity(), UserProfile::class.java)
//            requireActivity().startActivity(intent)
            val userFrag = UserFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()

        }

        return view

    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


    }

}