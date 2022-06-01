package com.app.challengicapp.design.userprofile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.modelclass.UserVideoOptionModel
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog

class UserVideoOptionAdap(
    private val context: Context,
    private val userVideoList: List<UserVideoOptionModel>
) :
     RecyclerView.Adapter<UserVideoOptionAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_video_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userVideoOptionModel = userVideoList[position]

        Glide.with(context).load(userVideoOptionModel.catImg).into(holder.ivCategory);
        Glide.with(context).load(userVideoOptionModel.userIV).into(holder.cIvUser);

        holder.tvtags.setText(userVideoOptionModel.tvTags)

        holder.imageMore.setOnClickListener {
            showBottomSheetDialog()
        }

    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(context)
        bottomSheetDialog.setContentView(R.layout.bottom_user_video_option)

        bottomSheetDialog.show()
    }


    override fun getItemCount(): Int {
        return userVideoList.size
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