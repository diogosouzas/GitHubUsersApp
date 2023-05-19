package com.sdiogosouza.githubapp.presentation

import androidx.lifecycle.ViewModel
import com.sdiogosouza.githubapp.domain.repository.UserRepository

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

}