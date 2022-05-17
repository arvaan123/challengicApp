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

        val searchdata = listOf(
            SearchModel(R.drawable.m1),
            SearchModel(R.drawable.m2),
            SearchModel(R.drawable.m3),
            SearchModel(R.drawable.m4),
            SearchModel(R.drawable.m5),
            SearchModel(R.drawable.m6)
        )


        val gridLayoutManager =
            GridLayoutManager(requireActivity(), 3, GridLayoutManager.VERTICAL, false)
        rvSearch.layoutManager = gridLayoutManager
        val searchadapter = SearchAdap(requireActivity(), searchdata)
        rvSearch.adapter = searchadapter

        return view
    }

}