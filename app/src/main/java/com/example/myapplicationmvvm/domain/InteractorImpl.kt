package com.example.myapplicationmvvm.domain

import com.example.myapplicationmvvm.data.Repo

class InteractorImpl(private val repo:Repo): BaseInteractor {
    override fun getDataFromRepo(): String = repo.getData()
}