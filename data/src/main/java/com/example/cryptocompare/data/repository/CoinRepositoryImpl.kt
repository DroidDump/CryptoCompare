package com.example.cryptocompare.data.repository

import com.example.cryptocompare.data.storage.CoinListStorage
import com.example.cryptocompare.data.storage.CoinStorage
import com.example.cryptocompare.data.storage.models.Coin
import com.example.cryptocompare.domain.models.CoinItem
import com.example.cryptocompare.domain.repository.CoinRepository


class CoinRepositoryImpl(
    private val coinStorage: CoinStorage,
    private val coinListStorage: CoinListStorage
    ) : CoinRepository {

    override fun getCoinItem(fromSymbol: String): CoinItem {
        val coin = coinStorage.get(fromSymbol)
        return mapToDomain(coin)
    }

    override fun getCoinList(): List<CoinItem> {
        val coinList = coinListStorage.get()
        val coinItemList = mutableListOf<CoinItem>()
        for (coin in coinList) {
            coinItemList.add(mapToDomain(coin))
        }
        return coinItemList
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
