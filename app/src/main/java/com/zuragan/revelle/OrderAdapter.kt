package com.zuragan.revelle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class OrderAdapter(context: Context, private val orders: List<String>) :
    ArrayAdapter<String>(context, 0, orders) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        val order = orders[position]
        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = order
        return view
    }
}
