package com.sdiogosouza.githubapp.data.remote.helper

import java.io.IOException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkErrorInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = runCatching {
        val request = chain.request()
        val response = chain.proceed(request)

        if (response.isSuccessful) {
            response
        } else {
            //TODO "Lidar com erros de comunicação"
            throw IOException("Erro de comunicação. Código: ${response.code()}")
        }
    }.getOrElse {
        //TODO "Lidar com exceções de comunicação"
        throw IOException("Erro de comunicação com o serviço")
    }
}
