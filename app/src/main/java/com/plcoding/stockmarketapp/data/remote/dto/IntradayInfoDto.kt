package com.plcoding.stockmarketapp.data.remote.dto

data class IntradayInfoDto(
    val timestamp: String,
    val close: Double
)

// this is for the data layer, in the domain layer a class with this info is mapped to be accessed