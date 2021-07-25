package com.evgenyminaenkov.todo.domain

interface Repository {
    fun getData() : List<String>
}