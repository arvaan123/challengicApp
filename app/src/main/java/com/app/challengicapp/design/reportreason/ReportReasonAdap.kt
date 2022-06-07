package com.app.challengicapp.design.reportreason

import android.app.Dialog
import android.content.Context
import android.view.*
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R

class ReportReasonAdap(
    private val context: Context,
    private val reportList: List<ReportReasonModel>
) :
    RecyclerView.Adapter<ReportReasonAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.report_reason_box_itemlist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val reportReasonModel = reportList[position]
        holder.tvReportReasonList.setText(reportReasonModel.tvReportReasonList)
        val sReasonText: String = holder.tvReportReasonList.getText().toString()

        holder.conLayReportReason.setOnClickListener {

            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.report_msg_box)

            val close = dialog.findViewById<ImageView>(R.id.imageClose)
            close.setOnClickListener {
                dialog.dismiss()
            }

            val etReportMsgBox = dialog.findViewById<EditText>(R.id.etReportMsgBox)
            etReportMsgBox.setText(sReasonText)

            val tvGoBack = dialog.findViewById<TextView>(R.id.tvGoBack)
            tvGoBack.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }
    }

    override fun getItemCount(): Int {
        return reportList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val tvReportReasonList: TextView = itemView.findViewById(R.id.tvReportReasonList)
        val conLayReportReason: ConstraintLayout = itemView.findViewById(R.id.conLayReportReason)

    }
}