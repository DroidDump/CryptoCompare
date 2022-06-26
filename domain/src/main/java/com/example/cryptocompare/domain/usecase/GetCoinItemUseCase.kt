package com.example.cryptocompare.domain.usecase

import com.example.cryptocompare.domain.models.CoinItem
import com.example.cryptocompare.domain.repository.CoinRepository


class GetCoinItemUseCase(private val coinRepository: CoinRepository) {

    fun execute(fromSymbol: String): CoinItem {
        return coinRepository.getCoinItem(fromSymbol)
    }
}
