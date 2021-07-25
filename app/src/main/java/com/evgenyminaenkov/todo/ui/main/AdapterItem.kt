package com.evgenyminaenkov.todo.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgenyminaenkov.todo.databinding.ItemTaskBinding

class AdapterItem(private var data : List<String>) : RecyclerView.Adapter<AdapterItem.MyHolder>() {

    private lateinit var binding: ItemTaskBinding
   // private lateinit var viewModel: MainViewModel


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterItem.MyHolder {
        binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyHolder(binding)

    }

    override fun onBindViewHolder(holder: AdapterItem.MyHolder, position: Int) {

        binding.checkbox.text = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }
    class MyHolder(binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}