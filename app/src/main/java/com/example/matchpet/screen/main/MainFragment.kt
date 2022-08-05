package com.example.matchpet.screen.main

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentMainBinding
import com.example.matchpet.screen.favorite.FavoriteFragment
import com.example.matchpet.screen.home.HomeFragment
import com.example.matchpet.screen.profile.ProfileFragment
import com.example.matchpet.screen.registerpet.RegisterPetFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater!!)
    }

    override val viewModel: MainViewModel by viewModels()

    override fun onInitViews() {
        binding.btNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    navigateTo(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.addPet -> {
                    navigateTo(RegisterPetFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.favorite -> {
                    navigateTo(FavoriteFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.profile -> {
                    navigateTo(ProfileFragment())
                    return@setOnItemSelectedListener true
                }
                else -> false

            }
        }
    }

    private fun navigateTo(fragment: Fragment) {
        fragmentManager
            ?.beginTransaction()
            ?.replace(R.id.flMain, fragment)
            ?.commit()
    }

    override fun onInitObservers() {}
}