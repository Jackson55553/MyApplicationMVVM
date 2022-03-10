package com.example.myapplicationmvvm.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationmvvm.databinding.ActivityMainBinding
import com.example.myapplicationmvvm.presentation.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private val mainActivityViewModel: MainActivityViewModel by lazy {
        ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityViewModel.liveData.observe(this) {
            binding.text.text = it
        }
        binding.btn.setOnClickListener {
            mainActivityViewModel.getData()
        }
    }
}


