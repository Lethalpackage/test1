package com.example.test

import android.app.Application
import com.example.test.features.main_screen.di.mainScreenModule
import com.example.test.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App:Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(appModule, mainScreenModule)
        }
    }
}