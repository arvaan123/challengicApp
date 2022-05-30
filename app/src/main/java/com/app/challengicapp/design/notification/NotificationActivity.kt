package com.app.challengicapp.design.notification

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.notification.adapter.NotificationAdapter

class NotificationActivity : AppCompatActivity() {
    lateinit var rvNotification: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val list= intArrayOf(20)
        rvNotification = findViewById(R.id.rvNotification)
        rvNotification.layoutManager = LinearLayoutManager(this)
        rvNotification.adapter = NotificationAdapter(this)

    }
}