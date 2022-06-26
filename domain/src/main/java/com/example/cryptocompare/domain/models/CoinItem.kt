package com.example.cryptocompare.domain.models


data class CoinItem (
    val fromSymbol: String,
    val toSymbol: String,
    val price: Double,
    val minPrice: Double, // LOWDAY
    val maxPrice: Double, // HIGHDAY
    val lastMarket: String,
    val lastUpdate: String,
    val imageUrl: String,
)
