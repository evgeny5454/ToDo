package com.evgenyminaenkov.todo.domain

class MockRepository : Repository {
    override fun getData(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach{i -> data.add( "$i Item")}
        return data
    }
}