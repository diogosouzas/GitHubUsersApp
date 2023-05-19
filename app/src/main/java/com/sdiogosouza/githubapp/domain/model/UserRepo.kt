package com.sdiogosouza.githubapp.domain.model

data class UserRepo(
    val id: Long,
    val name: String,
    val description: String = "",
    val language: String,
)