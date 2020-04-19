package com.example.dagger_simple_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_simple_project.dagger.injector.AppInjector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
