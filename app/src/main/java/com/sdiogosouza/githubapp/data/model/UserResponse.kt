package com.sdiogosouza.githubapp.data.model

import com.google.gson.annotations.SerializedName
import com.sdiogosouza.githubapp.domain.model.User
import java.io.Serializable

data class UserResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("login") val login: String,
    @SerializedName("avatar_url") val avatarUrl: String = ""
) : Serializable

fun UserResponse.toUser() = User(
    id = this.id,
    login = this.login,
    avatarUrl = this.avatarUrl
)
