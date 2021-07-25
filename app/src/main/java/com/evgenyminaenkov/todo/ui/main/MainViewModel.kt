package com.evgenyminaenkov.todo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgenyminaenkov.todo.domain.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {


    fun requestData() : List<String> {
        return repository.getData()
    }
}