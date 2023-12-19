package com.example.day12recy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView
    lateinit var LinearLayoutManager: LinearLayoutManager
    var List = arrayListOf<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)


        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))
        List.add(User("Sarwan Yadav", image = R.drawable.boyy))





        LinearLayoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=LinearLayoutManager



        recyclerView.adapter=ServiceAdapter(List, this@MainActivity)


    }
}