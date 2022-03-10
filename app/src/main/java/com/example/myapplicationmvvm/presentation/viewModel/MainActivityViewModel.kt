package com.example.myapplicationmvvm.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplicationmvvm.App
import com.example.myapplicationmvvm.domain.BaseInteractor

class MainActivityViewModel : ViewModel() {
    private val interactor: BaseInteractor = App.instance.interactor
    private val _liveData = MutableLiveData<String>()
    val liveData: LiveData<String>
    get() = _liveData

    fun getData() {
    val data = interactor.getDataFromRepo()
    _liveData.value = data
}
}