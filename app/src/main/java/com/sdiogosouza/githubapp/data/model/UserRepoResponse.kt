package com.sdiogosouza.githubapp.data.model

import com.google.gson.annotations.SerializedName
import com.sdiogosouza.githubapp.domain.model.UserRepo
import java.io.Serializable

data class UserRepoResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String = "",
    @SerializedName("language") val language: String,
) : Serializable

fun UserRepoResponse.toUserRepo() = UserRepo(
    id = this.id,
    name = this.name,
    description = this.description,
    language = this.language
)
