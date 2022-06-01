package com.app.challengicapp.design.userprofile.userfollowing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.userprofile.modelclass.UserFollowModel
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class UserFollowingAdap(private val context: Context, private val uFollowingList: List<UserFollowModel>) :
     RecyclerView.Adapter<UserFollowingAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_following_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userFollowModel = uFollowingList[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.tvPersonName.setText(userFollowModel.tvPersonName)
        holder.tvVotes.setText(userFollowModel.tvVotes)

        Glide.with(context).load(userFollowModel.userProfileImage).into(holder.ivProfile);
        Glide.with(context).load(userFollowModel.countryImage).into(holder.ivCountry);


        holder.tvUnFollow.setOnClickListener {
           holder.tvFollow.setVisibility(View.VISIBLE)
           holder.tvUnFollow.setVisibility(View.GONE)

        }

        holder.tvFollow.setOnClickListener {
            holder.tvUnFollow.setVisibility(View.VISIBLE)
            holder.tvFollow.setVisibility(View.GONE)

        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return uFollowingList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivProfile: CircleImageView = itemView.findViewById(R.id.ivProfile)
        val ivCountry: ImageView = itemView.findViewById(R.id.ivCountry)
        val tvPersonName: TextView = itemView.findViewById(R.id.tvPersonName)
        val tvVotes: TextView = itemView.findViewById(R.id.tvVotes)
        val tvUnFollow: TextView = itemView.findViewById(R.id.tvunfollow)
        val tvFollow: TextView = itemView.findViewById(R.id.tvfollow)

    }

}