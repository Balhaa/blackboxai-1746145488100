package com.zuragan.revelle

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextShoeName: EditText
    private lateinit var buttonAddOrder: Button
    private lateinit var listViewOrders: ListView

    private val orderList = mutableListOf<String>()
    private lateinit var adapter: OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextShoeName = findViewById(R.id.editTextShoeName)
        buttonAddOrder = findViewById(R.id.buttonAddOrder)
        listViewOrders = findViewById(R.id.listViewOrders)

        adapter = OrderAdapter(this, orderList)
        listViewOrders.adapter = adapter

        buttonAddOrder.setOnClickListener {
            val shoeName = editTextShoeName.text.toString().trim()
            if (shoeName.isEmpty()) {
                Toast.makeText(this, "Masukkan nama sepatu", Toast.LENGTH_SHORT).show()
            } else {
                orderList.add(shoeName)
                adapter.notifyDataSetChanged()
                editTextShoeName.text.clear()
            }
        }
    }
}
