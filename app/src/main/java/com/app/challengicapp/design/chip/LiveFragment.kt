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

class LiveFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_live, container, false)

        val liverv = view.findViewById<RecyclerView>(R.id.liverv)
        val livedatalist = listOf(
            ChallengicModel(R.drawable.l1, R.drawable.u1, "#live #photography"),
            ChallengicModel(R.drawable.l2, R.drawable.u2, "#enjoylife #enjoythemoment "),
            ChallengicModel(
                R.drawable.l3,
                R.drawable.result_user_profile2,
                "#naturephotography #flowers #naturebeauty"
            ),
            ChallengicModel(
                R.drawable.l4,
                R.drawable.result_user_profile1,
                "#like #instadaily"
            ),
            ChallengicModel(R.drawable.l6, R.drawable.u1, "#flower_daily #flora #nature"),

            ChallengicModel(
                R.drawable.l5,
                R.drawable.u2,
                "#creativity #design #photography"
            )

        )

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        liverv.setLayoutManager(layoutManager)
        val adapter = ChallengicAdap(requireActivity(), livedatalist)
        liverv.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}