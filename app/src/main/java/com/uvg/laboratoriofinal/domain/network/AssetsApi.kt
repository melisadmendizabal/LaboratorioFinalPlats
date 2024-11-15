package com.uvg.laboratoriofinal.domain.network

import com.uvg.laboratoriofinal.domain.network.util.NetworkError
import com.uvg.laboratoriofinal.domain.network.util.Result
import com.uvg.laboratoriofinal.data.network.dto.EntryListDto
import com.uvg.laboratoriofinal.data.network.dto.EntryProfileDto


interface AssetsApi {
    suspend fun getAllAssets(): Result<EntryListDto, NetworkError>
    suspend fun getAssetsProfile(id: Int): Result<EntryProfileDto, NetworkError>
}