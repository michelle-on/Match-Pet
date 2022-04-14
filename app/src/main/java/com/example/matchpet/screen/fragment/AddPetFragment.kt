package com.example.matchpet.screen.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.matchpet.R
import com.example.matchpet.base.BaseFragment
import com.example.matchpet.databinding.FragmentAddPetBinding
import com.example.matchpet.db.DataBase

class AddPetFragment : BaseFragment<FragmentAddPetBinding>() {
    override fun getLayoutResource(): Int = R.layout.fragment_add_pet
    lateinit var db: DataBase
    private val buttonRegister = binding?.btRegisterPet
    override fun bindingInflater(inflater: LayoutInflater?): FragmentAddPetBinding? {
        return inflater?.let { FragmentAddPetBinding.inflate(it) }
    }

    override fun onInitView() {
    }
}