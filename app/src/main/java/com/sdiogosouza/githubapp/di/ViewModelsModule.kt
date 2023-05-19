package com.sdiogosouza.githubapp.di

import com.sdiogosouza.githubapp.presentation.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.Scope
import org.koin.dsl.module

val viewModulesModule = module {
    viewModel {
        provideUserViewModel()
    }
}

private fun Scope.provideUserViewModel() = UserViewModel(
    userRepository = get()
)
