package com.example.cryptocompare.domain.repository

import com.example.cryptocompare.domain.models.CoinItem


interface CoinListRepository {

    fun getCoinItem(fromSymbol: String)

    fun getCoinList(): List<CoinItem>
}
