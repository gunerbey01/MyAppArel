package com.example.myapp.repository

import com.example.myapp.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}