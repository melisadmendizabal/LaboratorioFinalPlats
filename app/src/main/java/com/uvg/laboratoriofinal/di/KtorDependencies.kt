package com.uvg.laboratoriofinal.di

import com.uvg.laboratoriofinal.data.network.HttpClientFactory
import io.ktor.client.HttpClient


object KtorDependencies {
    private var httpClient: HttpClient? = null

    private fun buildHttpClient(): HttpClient = HttpClientFactory.create()

    fun provideHttpClient(): HttpClient {
        return httpClient ?: synchronized(this) {
            httpClient ?: buildHttpClient().also { httpClient = it }
        }
    }
}