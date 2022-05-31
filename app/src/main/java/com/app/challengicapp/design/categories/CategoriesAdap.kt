package com.app.challengicapp.design.categories

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.challengic.ChallengicAdap
import com.app.challengicapp.design.challengic.ChallengicModel
import com.app.challengicapp.design.reportreason.ReportReasonAdap
import com.app.challengicapp.design.reportreason.ReportReasonModel
import com.bumptech.glide.Glide

class CategoriesAdap(
    private val context: Context,
    private val categoryList: List<CategoriesModel>
) :
     RecyclerView.Adapter<CategoriesAdap.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_categories, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val CategoriesModel = categoryList[position]

        Glide.with(context).load(CategoriesModel.categoryimage).into(holder.categoryImage);
        holder.tvCategoriesName.setText(CategoriesModel.categoryname)

    }

    override fun getItemCount(): Int {
        return categoryList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.categoryImage)
        val tvCategoriesName: TextView = itemView.findViewById(R.id.tvCategoriesName)
    }

}