package com.example.cryptocompare.data.storage

import com.example.cryptocompare.data.storage.models.Coin

interface CoinStorage {

    fun get(fromSymbol: String): Coin
}
