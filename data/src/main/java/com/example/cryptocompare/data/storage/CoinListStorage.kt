package com.example.cryptocompare.data.storage

import com.example.cryptocompare.data.storage.models.Coin


interface CoinListStorage {
    fun get(): List<Coin>
}
