package com.example.matchpet.screen.main

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater!!)
    }

    override val viewModel: MainViewModel by viewModels()

    override fun onInitViews() {}

    override fun onInitObservers() {}
}
