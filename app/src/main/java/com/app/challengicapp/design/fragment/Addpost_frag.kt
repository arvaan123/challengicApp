package com.app.challengicapp.design.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.adapter.PostAdap
import com.app.challengicapp.design.model.LaderboardModel
import com.app.challengicapp.design.model.PostModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*


class Addpost_frag : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_addpost, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.post_rv)

        val data = listOf(
            PostModel(R.drawable.m1, R.drawable.u2, "#musicnotes #music"),
            PostModel(R.drawable.m2, R.drawable.u1, "#headphones #lyrics"),
            PostModel(R.drawable.m3, R.drawable.result_user_profile1, "#music #classical #igmusic"),
            PostModel(R.drawable.m4, R.drawable.result_user_profile2, "#singing #classicalmusic"),
            PostModel(R.drawable.m5, R.drawable.u1, "#musician #radio"),
            PostModel(R.drawable.m6, R.drawable.u2, "#guitar #music")
        )


        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.setLayoutManager(layoutManager)
        val adapter = PostAdap(requireActivity(), data)
        recyclerview.adapter = adapter

        val user_iv = view.findViewById<ImageView>(R.id.user_iv)
        user_iv.setOnClickListener {
//            val intent = Intent(requireActivity(), UserProfile::class.java)
//            requireActivity().startActivity(intent)
            val userFrag = User_frag()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, userFrag).addToBackStack(null).commit()

        }

        return view

    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


    }

}