package com.example.learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? = null
    var listName = arrayListOf (
        "Chompoo",
        "Chompoonuch",
        "ChomChom",
        "Nommanas"
    )
    var name : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = "Chompoonuch Nommanas"
        initComponent()
    }

    private fun initComponent() {
        recyclerView = findViewById(R.id.recycler_view)

        var decoration: DividerItemDecoration? = DividerItemDecoration(this, LinearLayout.VERTICAL)
        decoration?.let { recyclerView?.addItemDecoration(it) }
        recyclerView?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
//        var learningAdapter = LearningAdapter(name.toString(), this)
        var learningAdapter = LearningAdapter(listName, this)
        recyclerView?.adapter = learningAdapter
    }
}