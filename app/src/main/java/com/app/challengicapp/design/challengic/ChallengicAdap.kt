package com.app.challengicapp.design.challengic

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
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

        val PostModel = challengicList[position]

        Glide.with(context).load(PostModel.image).into(holder.ImageCategory);
        Glide.with(context).load(PostModel.userImage).into(holder.userImage);

        holder.tvtags.setText(PostModel.tvTag)

        holder.moreImage.setOnClickListener {
            showBottomSheetDialog()
        }

    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(context)
        bottomSheetDialog.setContentView(R.layout.bottom_challengic_video_option)

        val tvFollow = bottomSheetDialog.findViewById<TextView>(R.id.tvFollow)

        val tvunFollow = bottomSheetDialog.findViewById<TextView>(R.id.tvunFollow)

        tvunFollow?.setOnClickListener {
            tvunFollow.setVisibility(View.GONE)
            tvFollow?.setVisibility(View.VISIBLE)

        }

        tvFollow?.setOnClickListener {
            tvunFollow?.setVisibility(View.VISIBLE)
            tvFollow.setVisibility(View.GONE)

        }

        val layReport = bottomSheetDialog.findViewById<LinearLayout>(R.id.layReport)
        layReport?.setOnClickListener {
            val dialog = Dialog(context)
            //  dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.report_reason_box)

            val data = listOf(
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

            val reportrv = dialog.findViewById<RecyclerView>(R.id.reportrv)
            reportrv.layoutManager = LinearLayoutManager(context)
            reportrv.adapter = ReportReasonAdap(context, data)


            val close = dialog.findViewById<ImageView>(R.id.closeiv)
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
        val ImageCategory: ImageView = itemView.findViewById(R.id.ImageCategory)
        val userImage: ImageView = itemView.findViewById(R.id.userImage)
        val tvtags: TextView = itemView.findViewById(R.id.tvtags)

        val moreImage: ImageView = itemView.findViewById(R.id.moreImage)

    }


}


