package com.app.challengicapp.design.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.model.ReportReasonModel

class ReportReasonAdap(
    private val context: Context,
    private val report_list: List<ReportReasonModel>
) :
    RecyclerView.Adapter<ReportReasonAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.report_reason_box_itemlist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ReportReason = report_list[position]
        holder.tv_report_reason_list.setText(ReportReason.tv_report_reason_list)

        holder.rl_report_reason.setOnClickListener {

            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.report_msg_box)

            val close = dialog.findViewById<ImageView>(R.id.close_iv)
            close.setOnClickListener {
                dialog.dismiss()
            }

            val tv_go_back = dialog.findViewById<TextView>(R.id.tv_go_back)
            tv_go_back.setOnClickListener {
                val dialog = Dialog(context)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setCancelable(false)
                dialog.setContentView(R.layout.report_reason_box)
            }

            dialog.show()
        }
    }

    override fun getItemCount(): Int {
        return report_list.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val tv_report_reason_list: TextView = itemView.findViewById(R.id.tv_report_reason_list)
        val rl_report_reason: RelativeLayout = itemView.findViewById(R.id.rl_report_reason)

    }
}