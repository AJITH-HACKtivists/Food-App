package com.example.food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fooditems : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fooditems)
        val items:List<String> = listOf("Hello","Hi","Bye","ByeBye","How r u","R u fine")
        var re=findViewById<RecyclerView>(R.id.recycle)
        re.adapter=AdapterClass(items)
        re.layoutManager=LinearLayoutManager(this)
    }
}