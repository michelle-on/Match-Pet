package com.example.matchpet.screen.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.matchpet.R
import com.example.matchpet.base.BaseFragment
import com.example.matchpet.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getLayoutResource(): Int = R.layout.fragment_profile

    override fun bindingInflater(inflater: LayoutInflater?): FragmentProfileBinding? {
        return inflater?.let { FragmentProfileBinding.inflate(it) }
    }

    override fun onInitView() {
    }

}