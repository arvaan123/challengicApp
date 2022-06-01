package com.app.challengicapp.design.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R

class SearchFragment : Fragment() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_search, container, false)

        val rvSearch = view.findViewById<RecyclerView>(R.id.rvSearch)

        val searchDataList = listOf(
            SearchModel(R.drawable.m1),
            SearchModel(R.drawable.d10),
            SearchModel(R.drawable.p3),
            SearchModel(R.drawable.l2),
            SearchModel(R.drawable.s3),
            SearchModel(R.drawable.m8),
            SearchModel(R.drawable.l5),
            SearchModel(R.drawable.s7),
            SearchModel(R.drawable.d4),
            SearchModel(R.drawable.p5),
            SearchModel(R.drawable.p7),
            SearchModel(R.drawable.s9),
            SearchModel(R.drawable.m4),
            SearchModel(R.drawable.d3),
            SearchModel(R.drawable.l6),
            SearchModel(R.drawable.d9),
            SearchModel(R.drawable.s4)
        )

        val gridLayoutManager =
            GridLayoutManager(requireActivity(), 3, GridLayoutManager.VERTICAL, false)
        rvSearch.layoutManager = gridLayoutManager
        val searchAdap = SearchAdap(requireActivity(), searchDataList)
        rvSearch.adapter = searchAdap

        return view
    }

}