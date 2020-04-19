package com.example.dagger_simple_project.dagger.module

import com.example.dagger_simple_project.MainApplication
import com.example.dagger_simple_project.objects.MobileSuitObject
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// MobuilSuitModule.kt
@Module
class MobuilSuitModule {
    @Singleton
    @Provides
    fun provideUserPreference(application: MainApplication) =
        MobileSuitObject(application.applicationContext)
}