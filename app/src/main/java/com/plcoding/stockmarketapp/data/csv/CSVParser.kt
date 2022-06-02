package com.plcoding.stockmarketapp.data.csv

import java.io.InputStream

// follows the solid principles of using abstractions instead of concrete implementations
interface CSVParser<T> {
    suspend fun parse(stream: InputStream): List<T>
}