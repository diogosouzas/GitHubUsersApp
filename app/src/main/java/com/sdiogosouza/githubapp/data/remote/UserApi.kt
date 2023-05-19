package com.sdiogosouza.githubapp.data.remote

import com.sdiogosouza.githubapp.domain.model.User
import com.sdiogosouza.githubapp.domain.model.UserDetails
import com.sdiogosouza.githubapp.domain.model.UserRepo
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {

    @GET("/users")
    suspend fun getAllUsers(): List<User>

    @GET("/users/{userName}")
    suspend fun getUser(
        @Path("userName") userName: String
    ): UserDetails

    @GET("/users/{userName}/repos")
    suspend fun getUserRepo(
        @Path("userName") userName: String
    ): List<UserRepo>
}
