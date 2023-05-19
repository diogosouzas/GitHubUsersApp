package com.sdiogosouza.githubapp

import android.app.Application
import com.sdiogosouza.githubapp.di.networkModule
import com.sdiogosouza.githubapp.di.repositoriesModule
import com.sdiogosouza.githubapp.di.viewModulesModule
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                networkModule,
                repositoriesModule,
                viewModulesModule
            )
        }
    }
}