package com.example.cryptocompare.domain.usecase

import com.example.cryptocompare.domain.repository.CoinListRepository


class GetCoinItemUseCase(private val coinListRepository: CoinListRepository) {

    fun execute(fromSymbol: String) {
        return coinListRepository.getCoinItem(fromSymbol)
    }
}
