package com.plcoding.stockmarketapp.data.remote.dto

import com.squareup.moshi.Json

// field annotation is needed because of the capital letter
data class CompanyInfoDto(
    @field:Json(name = "Symbol") val symbol: String?,
    @field:Json(name = "Description") val description: String?,
    @field:Json(name = "Name") val name: String?,
    @field:Json(name = "Country") val country: String?,
    @field:Json(name = "Industry") val industry: String?,
)

// this is for the data layer, in the domain layer a class with this info is mapped to be accessed