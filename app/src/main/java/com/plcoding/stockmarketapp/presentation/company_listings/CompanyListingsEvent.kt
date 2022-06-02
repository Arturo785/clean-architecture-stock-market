package com.plcoding.stockmarketapp.presentation.company_listings

// the things the user can trigger from the UI
sealed class CompanyListingsEvent {
    object Refresh : CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String) : CompanyListingsEvent()
}