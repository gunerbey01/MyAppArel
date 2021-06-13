package com.example.myapp.base

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.repository.MainRepository
import com.example.myapp.vm.MainViewModel

class MainViewModelProviderFactory(val app: Application,
                                   private val mainRepository: MainRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(app, mainRepository) as T
    }
}