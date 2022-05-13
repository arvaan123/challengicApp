package com.app.challengicapp.design.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.model.PostModel
import com.app.challengicapp.design.model.ReportReason
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView


class PostAdap(private val context: Context, private val mList: List<PostModel>) :
    RecyclerView.Adapter<PostAdap.ViewHolder>() {

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
                ReportReason("It's spam"),
                ReportReason("Nudity or sexual activities"),
                ReportReason("Hate speech or symbols"),
                ReportReason("Violence or dangerous organizations"),
                ReportReason("Safe or illegal or regulated goods"),
                ReportReason("Bulling or harassment"),
                ReportReason("Intellectual property violation"),
                ReportReason("Suicide or self-injury"),
                ReportReason("Eating disorders"),
                ReportReason("Scam or fraud"),
                ReportReason("False information"),
                ReportReason("I just don't like it")
            )


            val report_rv = dialog.findViewById<RecyclerView>(R.id.report_rv)
            report_rv.layoutManager = LinearLayoutManager(context)
            report_rv.adapter = ReportReasonAdap(context, data)

            val close=dialog.findViewById<ImageView>(R.id.close_iv)
            close.setOnClickListener {
                dialog.dismiss()
            }


//            val body = dialog.findViewById(R.id.body) as TextView
//            body.text = title
//            val yesBtn = dialog.findViewById(R.id.yesBtn) as Button
//            val noBtn = dialog.findViewById(R.id.noBtn) as TextView
//            yesBtn.setOnClickListener {
//                dialog.dismiss()
//            }
//            noBtn.setOnClickListener { dialog.dismiss() }
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


