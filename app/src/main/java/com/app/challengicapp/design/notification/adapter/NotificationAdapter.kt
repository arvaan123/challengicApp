package com.app.challengicapp.design.notification.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import de.hdodenhof.circleimageview.CircleImageView


class NotificationAdapter(val context: Context) :
    RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {


    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cIvUserNotification: CircleImageView = itemView.findViewById(R.id.cIvUserNotification)
        val cIvDualNotificationOne: CircleImageView =
            itemView.findViewById(R.id.cIvDualNotificationOne)
        val cIvDualNotificationTwo: CircleImageView =
            itemView.findViewById(R.id.cIvDualNotificationTwo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        return NotificationViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list_notification, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        if (position % 2 == 0) {
            holder.cIvDualNotificationTwo.visibility = View.GONE
            holder.cIvDualNotificationOne.visibility = View.GONE
            holder.cIvUserNotification.visibility = View.VISIBLE
        } else {
            holder.cIvDualNotificationTwo.visibility = View.VISIBLE
            holder.cIvDualNotificationOne.visibility = View.VISIBLE
            holder.cIvUserNotification.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return 20
    }
}