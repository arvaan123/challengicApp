package com.app.challengicapp.design.notification.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
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
        val conLayoutNotification: ConstraintLayout =
            itemView.findViewById(R.id.conLayoutNotification)
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

        holder.conLayoutNotification.setOnClickListener {
            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.notification_dialog_box)

            val close = dialog.findViewById<ImageView>(R.id.imageClose)
            close.setOnClickListener {
                dialog.dismiss()
            }

           /* val etReportMsgBox = dialog.findViewById<EditText>(R.id.etReportMsgBox)
            etReportMsgBox.setText(sReasonText)

            val tvGoBack = dialog.findViewById<TextView>(R.id.tvGoBack)
            tvGoBack.setOnClickListener {
                dialog.dismiss()
            }*/

            dialog.show()
        }
    }

    override fun getItemCount(): Int {
        return 20
    }
}