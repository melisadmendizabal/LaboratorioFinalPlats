package com.uvg.laboratoriofinal.data.network

import com.uvg.laboratoriofinal.domain.network.AssetsApi
import com.uvg.laboratoriofinal.data.network.util.safeCall
import com.uvg.laboratoriofinal.data.network.dto.EntryListDto
import com.uvg.laboratoriofinal.data.network.dto.EntryProfileDto
import com.uvg.laboratoriofinal.domain.network.util.Result
import com.uvg.laboratoriofinal.domain.network.util.NetworkError
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class KtorAssetApi(
    private val httpClient: HttpClient
): AssetsApi {
    override suspend fun getAllAssets(): Result<EntryListDto, NetworkError> {
        return safeCall<EntryListDto> {
            httpClient.get(
                "https://botw-compendium.herokuapp.com/api/v3/compendium/category/monsters"
            )
        }
    }

    override suspend fun getAssetsProfile(id: Int): Result<EntryProfileDto, NetworkError> {
        return safeCall<EntryProfileDto> {
            httpClient.get(
                "https://botw-compendium.herokuapp.com/api/v3/compendium/entry/{id}"
            )
        }
    }
}