package com.example.cryptocompare.domain.usecase

import com.example.cryptocompare.domain.models.CoinItem
import com.example.cryptocompare.domain.repository.CoinRepository


class GetCoinListUseCase(private val coinRepository: CoinRepository) {

    fun execute(): List<CoinItem> {
        return coinRepository.getCoinList()
    }
}
