package com.sdiogosouza.githubapp.data.remote.helper

import com.sdiogosouza.githubapp.data.remote.UserApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Service(private val api: UserApi) {

    companion object {
        fun create(baseUrl: String): Service {
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(NetworkErrorInterceptor())
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val apiService = retrofit.create(UserApi::class.java)
            return Service(apiService)
        }
    }
}