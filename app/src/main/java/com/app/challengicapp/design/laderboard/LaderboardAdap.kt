package com.app.challengicapp.design.laderboard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.result.ResultPageFragment
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class LaderboardAdap(private val context: Context, private val mList: List<LaderboardModel>) :
    RecyclerView.Adapter<LaderboardAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.laderboard_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val LaderboardModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.tv_person_name.setText(LaderboardModel.tv_person_name)
        holder.tv_votes.setText(LaderboardModel.tv_votes)
        holder.tv_results.setText(LaderboardModel.tv_results)
        holder.tv_results.setOnClickListener {

            val activity = context as AppCompatActivity

            val resultFrag = ResultPageFragment()
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.container, resultFrag).addToBackStack(null).commit()
        }
        Glide.with(context).load(LaderboardModel.profile_image).into(holder.profile_iv);
        Glide.with(context).load(LaderboardModel.country_iv).into(holder.country_iv);

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
        val tv_results: TextView = itemView.findViewById(R.id.tv_results)

    }
}