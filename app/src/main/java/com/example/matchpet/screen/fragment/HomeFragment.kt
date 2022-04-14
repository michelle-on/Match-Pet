package com.example.matchpet.screen.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.room.Room
import com.example.matchpet.R
import com.example.matchpet.base.BaseFragment
import com.example.matchpet.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutResource(): Int = R.layout.fragment_home
    override fun bindingInflater(inflater: LayoutInflater?): FragmentHomeBinding? {
        return inflater?.let { FragmentHomeBinding.inflate(it) }
    }

    override fun onInitView() {
        Toast.makeText(context, "home fragment", Toast.LENGTH_SHORT).show()
    }
}