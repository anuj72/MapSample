package com.pouyaheydari.sample.map.android.features.base.di

import com.pouyaheydari.sample.map.android.features.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Represents instance of all ViewModels and injects [DataRepository] in ViewModels.
 */
val viewModelModule = module {
    viewModel { SplashViewModel() }
}
