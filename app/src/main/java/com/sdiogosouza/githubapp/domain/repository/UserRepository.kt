package com.sdiogosouza.githubapp.domain.repository

import com.sdiogosouza.githubapp.domain.model.User
import com.sdiogosouza.githubapp.domain.model.UserDetails
import com.sdiogosouza.githubapp.domain.model.UserRepo

interface UserRepository {

    suspend fun getAllUsers(): List<User>
    suspend fun getUser(userName: String): UserDetails
    suspend fun getUserRepo(userName: String): List<UserRepo>
}
