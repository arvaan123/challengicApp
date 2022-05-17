package com.app.challengicapp.design.challengic

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.reportreason.ReportReasonAdap
import com.app.challengicapp.design.reportreason.ReportReasonModel
import com.bumptech.glide.Glide


class ChallengicAdap(private val context: Context, private val mList: List<ChallengicModel>) :
    RecyclerView.Adapter<ChallengicAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.addpost_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val PostModel = mList[position]

        Glide.with(context).load(PostModel.image).into(holder.imageView);
        Glide.with(context).load(PostModel.user_image).into(holder.user_image);

        holder.tv_tags.setText(PostModel.tv_tag)

        holder.more_iv.setOnClickListener {
            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
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

            val report_rv = dialog.findViewById<RecyclerView>(R.id.report_rv)
            report_rv.layoutManager = LinearLayoutManager(context)
            report_rv.adapter = ReportReasonAdap(context, data)


            val close=dialog.findViewById<ImageView>(R.id.close_iv)
            close.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()

        }

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.post_iv)
        val user_image: ImageView = itemView.findViewById(R.id.user_image)
        val tv_tags: TextView = itemView.findViewById(R.id.tv_tags)

        val more_iv: ImageView = itemView.findViewById(R.id.more_iv)

    }


}


