package com.app.challengicapp.design.laderboard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController

import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.result.ResultPageFragment
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class LaderboardAdap(
    private val context: Context,
    private val laderboardList: List<LaderboardModel>,
    val nevigateToResultFragmentListener: () -> Unit
) :
    RecyclerView.Adapter<LaderboardAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.laderboard_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val laderboardModel = laderboardList[position]

        // sets the image to the imageview from our itemHolder class
        //  holder.profile_iv.setImageResource(LaderboardModel.profile_image)
        holder.tvPersonName.setText(laderboardModel.tvPersonName)
        holder.tvVotes.setText(laderboardModel.tvVotes)
        holder.tvResults.setText(laderboardModel.tvResults)

        holder.itemView.rootView.setOnClickListener {
            nevigateToResultFragmentListener.invoke()
        }

        Glide.with(context).load(laderboardModel.profileImage).into(holder.ivProfile);
        Glide.with(context).load(laderboardModel.countryIv).into(holder.ivCountry);


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return 10
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivProfile: CircleImageView = itemView.findViewById(R.id.ivProfile)
        val ivCountry: ImageView = itemView.findViewById(R.id.ivCountry)
        val tvPersonName: TextView = itemView.findViewById(R.id.tvPersonName)
        val tvVotes: TextView = itemView.findViewById(R.id.tvVotes)
        val tvResults: TextView = itemView.findViewById(R.id.tvResults)

    }
}