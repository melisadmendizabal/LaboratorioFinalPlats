package com.uvg.laboratoriofinal.data.network.dto

import com.uvg.laboratoriofinal.domain.model.Asset
import kotlinx.serialization.Serializable


@Serializable
data class EntryDto(
    val id: Int,
    val rank: String,
    val symbol: String,
    val name: String,
    val supply: String,
    val maxSupply: String,
    val marketCapUsd: String,
    val volumeUsd24Hr: String,
    val priceUsd: String,
    val changePercent24Hr: String,
    val vwap24Hr: String
    )

fun EntryDto.mapToAssetsModel(): Asset {
    return Asset(
        id = id,
        name = name,
        symbol = symbol,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr,
        supply = supply,
        maxSupply = maxSupply,
        marketCapUsd = marketCapUsd,
        date = vwap24Hr
    )
}
