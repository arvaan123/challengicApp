package com.app.challengicapp.design.result

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class ResultAdap(private val context: Context, private val resultList: List<ResultModel>) :
     RecyclerView.Adapter<ResultAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.result_items_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val resultModel = resultList[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.rTvPersonName.setText(resultModel.rTvPersonName)
        holder.rTvVotes.setText(resultModel.rTvVotes)
        holder.rTvResults.setText(resultModel.rTvResults)
        Glide.with(context).load(resultModel.ivProfileImage).into(holder.ivProfileImage);

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return resultList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivProfileImage: CircleImageView = itemView.findViewById(R.id.ivProfileImage)
        val rTvPersonName: TextView = itemView.findViewById(R.id.rTvPersonName)
        val rTvVotes: TextView = itemView.findViewById(R.id.rTvVotes)
        val rTvResults: TextView = itemView.findViewById(R.id.rTvResults)

    }
}