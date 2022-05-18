package com.app.challengicapp.design.categories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.challengicapp.R
import com.app.challengicapp.design.login.LoginActivity
import com.app.challengicapp.design.search.SearchAdap
import com.app.challengicapp.design.search.SearchModel

class CategoriesActivity : AppCompatActivity() {

    lateinit var tvContinue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val rvCategories = findViewById<RecyclerView>(R.id.rvCategories)

        val categorydata = listOf(
            CategoriesModel(R.drawable.d2, "Dance"),
            CategoriesModel(R.drawable.m8, "Sing"),
            CategoriesModel(R.drawable.s1, "Sports"),
            CategoriesModel(R.drawable.l4, "Category"),
            CategoriesModel(R.drawable.p5, "Category"),
            CategoriesModel(R.drawable.f1, "Category"),
            CategoriesModel(R.drawable.d9, "Category"),
            CategoriesModel(R.drawable.p6, "Category"),
            CategoriesModel(R.drawable.m4, "Category"),
            CategoriesModel(R.drawable.s4, "Category"),
            CategoriesModel(R.drawable.m6, "Category"),
            CategoriesModel(R.drawable.l3, "Category")
        )

        val gridLayoutManager =
            GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        rvCategories.layoutManager = gridLayoutManager
        val catadapter = CategoriesAdap(this, categorydata)
        rvCategories.adapter = catadapter

        tvContinue = findViewById(R.id.tvContinue)
        tvContinue.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))

        }

    }
}