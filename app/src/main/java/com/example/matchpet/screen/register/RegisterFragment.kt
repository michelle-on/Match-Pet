package com.example.matchpet.screen.register

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentRegisterBinding
import com.example.matchpet.util.ImageUtils

class RegisterFragment : BaseFragment<FragmentRegisterBinding, RegisterViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentRegisterBinding {
        return FragmentRegisterBinding.inflate(inflater!!)
    }

    override val viewModel: RegisterViewModel by viewModels()

    override fun onInitViews() {
        activity?.supportFragmentManager?.popBackStack()

        ImageUtils.setImageGlide(binding.icDog, R.drawable.ic_dog)

        binding.tvLogin.setOnClickListener {
            //navigation to login
        }

        binding.btRegister.setOnClickListener {
            //register user
            //navigation to login
        }
    }

    override fun onInitObservers() {}
}