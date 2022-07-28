package com.example.matchpet.screen.profile

import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentProfileBinding
import com.example.matchpet.screen.profile.ProfileViewModel
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater!!)
    }

    override val viewModel: ProfileViewModel by viewModels()

    override fun onInitViews() {
        binding.btLogout.setOnClickListener {
            //logout
            //        Firebase.auth.signOut()
        }
    }

    override fun onInitObservers() {}
}


