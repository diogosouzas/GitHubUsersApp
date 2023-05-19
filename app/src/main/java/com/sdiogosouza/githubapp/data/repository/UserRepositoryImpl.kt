package com.sdiogosouza.githubapp.data.repository

import com.sdiogosouza.githubapp.data.remote.UserApi
import com.sdiogosouza.githubapp.domain.model.User
import com.sdiogosouza.githubapp.domain.model.UserDetails
import com.sdiogosouza.githubapp.domain.model.UserRepo
import com.sdiogosouza.githubapp.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class UserRepositoryImpl(
    private val userApi: UserApi
) : UserRepository {

    override suspend fun getAllUsers(): List<User> = coroutineScope {
        withContext(Dispatchers.IO) {
            userApi.getAllUsers()
        }
    }

    override suspend fun getUser(userName: String): UserDetails = coroutineScope {
        withContext(Dispatchers.IO) {
            userApi.getUser(userName)
        }
    }

    override suspend fun getUserRepo(userName: String): List<UserRepo> = coroutineScope {
        withContext(Dispatchers.IO) {
            userApi.getUserRepo(userName)
        }
    }
}
