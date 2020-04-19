package com.example.dagger_simple_project

import android.app.Application
import com.example.dagger_simple_project.dagger.injector.AppInjector

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }
}