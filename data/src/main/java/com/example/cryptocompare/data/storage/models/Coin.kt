package com.example.cryptocompare.data.storage.models


data class Coin (
    val fromSymbol: String,
    val toSymbol: String,
    val price: Double,
    val minPrice: Double, // LOWDAY
    val maxPrice: Double, // HIGHDAY
    val lastMarket: String,
    val lastUpdate: String,
    val imageUrl: String,
)
