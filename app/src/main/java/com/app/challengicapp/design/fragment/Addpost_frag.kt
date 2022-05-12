package com.app.challengicapp.design.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.challengicapp.R
import com.app.challengicapp.design.adapter.PostAdap
import com.app.challengicapp.design.model.PostModel
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

        val data: ArrayList<PostModel> = ArrayList<PostModel>()
        data.add(PostModel(R.drawable.m1))
        data.add(PostModel(R.drawable.m2))
        data.add(PostModel(R.drawable.m3))
        data.add(PostModel(R.drawable.m4))
        data.add(PostModel(R.drawable.m5))
        data.add(PostModel(R.drawable.m6))

        val layoutManager: RecyclerView.LayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.setLayoutManager(layoutManager)

        val adapter = PostAdap(requireActivity(), data)
        recyclerview.adapter = adapter


        return view

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


    }

}