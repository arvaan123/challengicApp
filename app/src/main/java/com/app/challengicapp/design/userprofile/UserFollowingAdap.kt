package com.app.challengicapp.design.userprofile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class UserFollowingAdap(private val context: Context, private val mList: List<UserFollowModel>) :
    RecyclerView.Adapter<UserFollowingAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_following_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userfollowmodel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.tv_person_name.setText(userfollowmodel.tvPersonName)
        holder.tv_votes.setText(userfollowmodel.tvVotes)

        Glide.with(context).load(userfollowmodel.userProfileImage).into(holder.profile_iv);
        Glide.with(context).load(userfollowmodel.CountryImage).into(holder.country_iv);


        holder.tvunfollow.setOnClickListener {
           holder.tvfollow.setVisibility(View.VISIBLE)
           holder.tvunfollow.setVisibility(View.GONE)

        }

        holder.tvfollow.setOnClickListener {
            holder.tvunfollow.setVisibility(View.VISIBLE)
            holder.tvfollow.setVisibility(View.GONE)

        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val profile_iv: CircleImageView = itemView.findViewById(R.id.profile_image)
        val country_iv: ImageView = itemView.findViewById(R.id.country_iv)
        val tv_person_name: TextView = itemView.findViewById(R.id.tv_person_name)
        val tv_votes: TextView = itemView.findViewById(R.id.tv_votes)
        val tvunfollow: TextView = itemView.findViewById(R.id.tvunfollow)
        val tvfollow: TextView = itemView.findViewById(R.id.tvfollow)

    }

}