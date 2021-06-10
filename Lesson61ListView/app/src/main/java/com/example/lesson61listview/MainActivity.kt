package com.example.lesson61listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById<ListView>(R.id.listView)
        var nameList = ArrayList<String>()
        nameList.add("Леха")
        nameList.add("Ваня")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
         listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Позиция: $position", Toast.LENGTH_SHORT).show()
        }
    }
}