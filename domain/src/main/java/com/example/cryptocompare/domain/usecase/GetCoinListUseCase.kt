package com.example.cryptocompare.domain.usecase

import com.example.cryptocompare.domain.models.CoinItem
import com.example.cryptocompare.domain.repository.CoinListRepository


class GetCoinListUseCase(private val coinListRepository: CoinListRepository) {

    fun execute(): List<CoinItem> {
        return coinListRepository.getCoinList()
    }
}
