package com.example.cryptocompare.data.repository

import com.example.cryptocompare.data.storage.CoinStorage
import com.example.cryptocompare.data.storage.models.Coin
import com.example.cryptocompare.domain.models.CoinItem
import com.example.cryptocompare.domain.repository.CoinRepository


class CoinRepositoryImpl(private val coinStorage: CoinStorage) : CoinRepository {

    override fun getCoinItem(fromSymbol: String): CoinItem {
        val coinItem = coinStorage.get(fromSymbol)
        return mapToDomain(coinItem)
    }

    override fun getCoinList(): List<CoinItem> {
        TODO("Not yet implemented")
    }

    private fun mapToDomain(coin: Coin): CoinItem {
        return CoinItem(
            fromSymbol = coin.fromSymbol,
            toSymbol = coin.toSymbol,
            price = coin.price,
            minPrice = coin.minPrice,
            maxPrice = coin.maxPrice,
            lastMarket = coin.lastMarket,
            lastUpdate = coin.lastUpdate,
            imageUrl = coin.imageUrl
        )
    }
}
