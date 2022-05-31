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

class ResultAdap(private val context: Context, private val result_list: List<ResultModel>) :
     RecyclerView.Adapter<ResultAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.result_items_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ResultModel = result_list[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.r_tv_person_name.setText(ResultModel.r_tv_person_name)
        holder.r_tv_votes.setText(ResultModel.r_tv_votes)
        holder.r_tv_results.setText(ResultModel.r_tv_results)
        Glide.with(context).load(ResultModel.iv_profile_image).into(holder.iv_profile_image);

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return result_list.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val iv_profile_image: CircleImageView = itemView.findViewById(R.id.iv_profile_image)
        val r_tv_person_name: TextView = itemView.findViewById(R.id.r_tv_person_name)
        val r_tv_votes: TextView = itemView.findViewById(R.id.r_tv_votes)
        val r_tv_results: TextView = itemView.findViewById(R.id.r_tv_results)

    }
}