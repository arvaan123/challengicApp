package com.app.challengicapp.design.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R


class ResultPageFragment : Fragment() { 

    val data = listOf(
        ResultModel(R.drawable.u1, "Tina", "554 votes", "4th"),
        ResultModel(R.drawable.u2, "Miller", "378 votes", "5th"),
        ResultModel(R.drawable.result_user_profile1, "Kai", "289 votes", "6th"),
        ResultModel(R.drawable.result_user_profile2, "Matt", "167 votes", "7th"),
        ResultModel(R.drawable.u1, "Domi", "167 votes", "8th"),
        ResultModel(R.drawable.u2, "Ade", "90 votes", "9th"),
        ResultModel(R.drawable.result_user_profile2, "Kia", "50 votes", "10th"),
        ResultModel(R.drawable.result_user_profile1, "Lulia", "40 votes", "11th"),
        ResultModel(R.drawable.u2, "Marshall", "30 votes", "12th"),
        ResultModel(R.drawable.u1, "Larisa", "20 votes", "13th")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result_page, container, false)

        val result_rv = view.findViewById<RecyclerView>(R.id.result_rv)
        result_rv.layoutManager = LinearLayoutManager(requireActivity())
        result_rv.adapter = ResultAdap(requireActivity(), data)

        return view
    }

}