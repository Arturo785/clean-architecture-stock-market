package com.plcoding.stockmarketapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// this tells hilt where to get the application context
@HiltAndroidApp
class StockApplication : Application()