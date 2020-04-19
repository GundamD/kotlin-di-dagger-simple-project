package com.example.dagger_simple_project.dagger.component

import android.app.Application
import com.example.dagger_simple_project.MainApplication
import com.example.dagger_simple_project.dagger.module.MobuilSuitModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

// AppComponent.kt
@Singleton
@Component(
    modules = [
        MobuilSuitModule::class,
        AndroidSupportInjectionModule::class
    ])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(mainApplication: MainApplication)
}