package com.example.myapp.api

import com.example.myapp.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}