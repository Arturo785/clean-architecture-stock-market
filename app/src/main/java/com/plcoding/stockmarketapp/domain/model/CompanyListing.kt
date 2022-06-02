package com.plcoding.stockmarketapp.domain.model

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)

// like the one from the data layer but only to display relevant data and not collide
// presentation layer with data layer