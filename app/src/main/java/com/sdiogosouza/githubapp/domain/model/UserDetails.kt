package com.sdiogosouza.githubapp.domain.model

data class UserDetails(
    val id: Long,
    val login: String,
    val avatarUrl: String = "",
    val name: String = "",
    val company: String = "",
    val location: String = "",
    val publicRepos: Int = 0,
    val followers: Long,
    val following: Long,
)
