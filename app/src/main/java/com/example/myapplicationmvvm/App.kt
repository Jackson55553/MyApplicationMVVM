package com.example.myapplicationmvvm

import android.app.Application
import com.example.myapplicationmvvm.data.RepoImpl
import com.example.myapplicationmvvm.domain.BaseInteractor
import com.example.myapplicationmvvm.domain.InteractorImpl

class App:Application() {
    val interactor:BaseInteractor by lazy {
        InteractorImpl(RepoImpl())
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
    companion object{
        lateinit var instance:App
        private set
    }
}