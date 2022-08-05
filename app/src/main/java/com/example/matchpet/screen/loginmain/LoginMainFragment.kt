package com.example.matchpet.screen.loginmain

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentLoginMainBinding
import com.example.matchpet.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginMainFragment : BaseFragment<FragmentLoginMainBinding, LoginMainViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentLoginMainBinding {
        return FragmentLoginMainBinding.inflate(inflater!!)
    }

    override val viewModel: LoginMainViewModel by viewModels()

    override fun onInitViews() {}

    override fun onInitObservers() {}
}
