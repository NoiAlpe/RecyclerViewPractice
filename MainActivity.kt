package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        var todoList = mutableListOf(
            Todo("Email ACTION team", true),
            Todo("File leave application on ODTR", true),
            Todo("Approved 12/07/22 PM", false),
            Todo("Approved 12/09/22 AM", false),
            Todo("Approved 12/19/22", false),
            Todo("Approved 12/20/22", false)
        )

        val adapter = TodoAdapter(todoList)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        Log.i("MAIN BODY", "TODO LIST SIZE: ${todoList.size}")

        for ((index, i) in todoList.withIndex()) {
            Log.i("CONTEXT", " $index:  ${i.title}, ${i.isChecked}")
        }

    }

}