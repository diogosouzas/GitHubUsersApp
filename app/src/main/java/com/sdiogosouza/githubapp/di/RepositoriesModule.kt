package com.sdiogosouza.githubapp.di

import com.sdiogosouza.githubapp.data.repository.UserRepositoryImpl
import com.sdiogosouza.githubapp.domain.repository.UserRepository
import org.koin.dsl.module

val repositoriesModule = module {
    single<UserRepository> {
        UserRepositoryImpl(get())
    }
}