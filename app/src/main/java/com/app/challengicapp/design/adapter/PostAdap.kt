package com.app.challengicapp.design.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.model.PostModel
import com.bumptech.glide.Glide

class PostAdap(private val context: Context, private val mList: List<PostModel>) :
    RecyclerView.Adapter<PostAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.addpost_items, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val PostModel = mList[position]

        // sets the image to the imageview from our itemHolder class
       // holder.imageView.setImageResource(PostModel.image)
        Glide.with(context).load(PostModel.image).into(holder.imageView);

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.post_iv)
        //val textView: TextView = itemView.findViewById(R.id.textView)
    }


}


