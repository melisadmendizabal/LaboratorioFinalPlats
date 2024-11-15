package com.uvg.laboratoriofinal.domain.model

data class Asset(
    val id: Int,
    val name: String,
    val symbol: String,
    val priceUsd: String,
    val changePercent24Hr: String,
    val supply: String,
    val maxSupply: String,
    val marketCapUsd: String,
    val date: String

)