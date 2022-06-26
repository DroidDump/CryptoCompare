package com.example.cryptocompare.domain.repository

import com.example.cryptocompare.domain.models.CoinItem


interface CoinRepository {

    fun getCoinItem(fromSymbol: String): CoinItem

    fun getCoinList(): List<CoinItem>
}
