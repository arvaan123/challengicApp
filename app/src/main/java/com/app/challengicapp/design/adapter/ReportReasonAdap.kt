package com.app.challengicapp.design.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.model.ReportReason

class ReportReasonAdap(private val context: Context, private val report_list: List<ReportReason>) :
    RecyclerView.Adapter<ReportReasonAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.report_reason_box_itemlist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ReportReason = report_list[position]
        holder.tv_report_reason_list.setText(ReportReason.tv_report_reason_list)


    }

    override fun getItemCount(): Int {
        return report_list.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val tv_report_reason_list: TextView = itemView.findViewById(R.id.tv_report_reason_list)

    }
}