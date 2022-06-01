package com.app.challengicapp.design.search

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.bumptech.glide.Glide

class SearchAdap(private val context: Context, private val searchList: List<SearchModel>) :
     RecyclerView.Adapter<SearchAdap.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.searchpage_itemlist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val searchModel = searchList[position]

        Glide.with(context).load(searchModel.searchpageIV).into(holder.ivSearchpage);

    }

    override fun getItemCount(): Int {
        return searchList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivSearchpage: ImageView = itemView.findViewById(R.id.ivSearchpage)

    }
}