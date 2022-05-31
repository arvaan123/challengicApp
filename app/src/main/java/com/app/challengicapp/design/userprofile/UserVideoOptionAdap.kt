package com.app.challengicapp.design.userprofile

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
import com.app.challengicapp.design.challengic.ChallengicAdap
import com.app.challengicapp.design.challengic.ChallengicModel
import com.app.challengicapp.design.reportreason.ReportReasonAdap
import com.app.challengicapp.design.reportreason.ReportReasonModel
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog

class UserVideoOptionAdap(
    private val context: Context,
    private val uservideoList: List<UserVideoOptionModel>
) :
     RecyclerView.Adapter<UserVideoOptionAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_video_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val UserVideoOptionModel = uservideoList[position]

        Glide.with(context).load(UserVideoOptionModel.CatImg).into(holder.ImageCategory);
        Glide.with(context).load(UserVideoOptionModel.userIV).into(holder.userImage);

        holder.tvtags.setText(UserVideoOptionModel.tvTags)

        holder.moreImage.setOnClickListener {
            showBottomSheetDialog()
        }

    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(context)
        bottomSheetDialog.setContentView(R.layout.bottom_user_video_option)

        bottomSheetDialog.show()
    }


    override fun getItemCount(): Int {
        return uservideoList.size
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