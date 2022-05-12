package com.app.challengicapp.design.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.adapter.LaderboardAdap
import com.app.challengicapp.design.model.LaderboardModel

class Laderboard_frag : Fragment() {

    val data = listOf(
        LaderboardModel(R.drawable.l1,"Jenny","1367 votes","1st") ,
        LaderboardModel(R.drawable.l2,"Background 2","1298 votes","2nd") ,
        LaderboardModel(R.drawable.l3,"Background 3","1088 votes","3rd") ,
        LaderboardModel(R.drawable.l4,"Background 4","953 votes","4th") ,
        LaderboardModel(R.drawable.l5,"Background 5","777 votes","5th") ,
        LaderboardModel(R.drawable.l1,"Background 6","554 votes","6th") ,
        LaderboardModel(R.drawable.l2,"Background 7","398 votes","7th") ,
        LaderboardModel(R.drawable.l3,"Background 8","340 votes","8th") ,
        LaderboardModel(R.drawable.l4,"Background 9","274 votes","9th") ,
        LaderboardModel(R.drawable.l5,"Background 10","105 votes","10th")
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

        val view=inflater.inflate(R.layout.fragment_laderboard, container, false)


        val recyclerview = view.findViewById<RecyclerView>(R.id.laderboard_rv)
        recyclerview.layoutManager = LinearLayoutManager(requireActivity())
        recyclerview.adapter = LaderboardAdap(requireActivity(),data)



        return view
    }

}