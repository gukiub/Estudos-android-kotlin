package com.example.filmescoroutines.di

import com.example.filmescoroutines.ui.main.MainRepository
import com.example.filmescoroutines.ui.main.MainViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    factory {
        MainRepository()
    }

    viewModel {
        MainViewModel(
            repository = get()
        )
    }
}