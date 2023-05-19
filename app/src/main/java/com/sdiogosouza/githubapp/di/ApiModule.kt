package com.sdiogosouza.githubapp.di

import com.google.gson.GsonBuilder
import com.sdiogosouza.githubapp.data.remote.UserApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.github.com"

val networkModule = module {
    single { OkHttpClient() }
    single { GsonBuilder().create() }
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single { get<Retrofit>().create(UserApi::class.java) }
}