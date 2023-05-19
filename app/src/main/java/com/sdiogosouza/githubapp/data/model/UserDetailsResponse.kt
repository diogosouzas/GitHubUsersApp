package com.sdiogosouza.githubapp.data.model

import com.google.gson.annotations.SerializedName
import com.sdiogosouza.githubapp.domain.model.UserDetails
import java.io.Serializable

data class UserDetailsResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("login") val login: String,
    @SerializedName("avatar_url") val avatarUrl: String = "",
    @SerializedName("name") val name: String = "",
    @SerializedName("company") val company: String = "",
    @SerializedName("location") val location: String = "",
    @SerializedName("public_repos") val publicRepos: Int = 0,
    @SerializedName("followers") val followers: Long,
    @SerializedName("following") val following: Long,
) : Serializable

fun UserDetailsResponse.toUserDetails() = UserDetails(
    id = this.id,
    login = this.login,
    avatarUrl = this.avatarUrl,
    name = this.name,
    company = this.company,
    location = this.location,
    publicRepos = this.publicRepos,
    followers = this.followers,
    following = this.following
)
