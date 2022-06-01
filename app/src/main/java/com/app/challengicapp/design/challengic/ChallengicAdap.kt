package com.app.challengicapp.design.challengic

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.reportreason.ReportReasonAdap
import com.app.challengicapp.design.reportreason.ReportReasonModel
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog


class ChallengicAdap(
    private val context: Context,
    private val challengicList: List<ChallengicModel>
) :
    RecyclerView.Adapter<ChallengicAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.challengic_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val challengicModel = challengicList[position]

        Glide.with(context).load(challengicModel.image).into(holder.ivCategory);
        Glide.with(context).load(challengicModel.userImage).into(holder.cIvUser);

        holder.tvtags.setText(challengicModel.tvTag)

        holder.imageMore.setOnClickListener {
            showBottomSheetDialog()
        }

    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(context)
        bottomSheetDialog.setContentView(R.layout.bottom_challengic_video_option)

        val tvFollow = bottomSheetDialog.findViewById<TextView>(R.id.tvFollow)

        val tvUnFollow = bottomSheetDialog.findViewById<TextView>(R.id.tvUnFollow)

        tvUnFollow?.setOnClickListener {
            tvUnFollow.setVisibility(View.GONE)
            tvFollow?.setVisibility(View.VISIBLE)

        }

        tvFollow?.setOnClickListener {
            tvUnFollow?.setVisibility(View.VISIBLE)
            tvFollow.setVisibility(View.GONE)

        }

        val tvReport = bottomSheetDialog.findViewById<TextView>(R.id.tvReport)
        tvReport?.setOnClickListener {
            val dialog = Dialog(context)
            //  dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.report_reason_box)

            val reportDataList = listOf(
                ReportReasonModel("It's spam"),
                ReportReasonModel("Nudity or sexual activities"),
                ReportReasonModel("Hate speech or symbols"),
                ReportReasonModel("Violence or dangerous organizations"),
                ReportReasonModel("Safe or illegal or regulated goods"),
                ReportReasonModel("Bulling or harassment"),
                ReportReasonModel("Intellectual property violation"),
                ReportReasonModel("Suicide or self-injury"),
                ReportReasonModel("Eating disorders"),
                ReportReasonModel("Scam or fraud"),
                ReportReasonModel("False information"),
                ReportReasonModel("I just don't like it")
            )

            val rvReport = dialog.findViewById<RecyclerView>(R.id.rvReport)
            rvReport.layoutManager = LinearLayoutManager(context)
            rvReport.adapter = ReportReasonAdap(context, reportDataList)


            val close = dialog.findViewById<ImageView>(R.id.imageClose)
            close.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }

        bottomSheetDialog.show()
    }


    override fun getItemCount(): Int {
        return challengicList.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivCategory: ImageView = itemView.findViewById(R.id.ivCategory)
        val cIvUser: ImageView = itemView.findViewById(R.id.cIvUser)
        val tvtags: TextView = itemView.findViewById(R.id.tvTags)

        val imageMore: ImageView = itemView.findViewById(R.id.imageMore)

    }


}


