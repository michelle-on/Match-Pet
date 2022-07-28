package com.example.matchpet.screen.registerpet

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentRegisterPetBinding
import com.example.matchpet.screen.registerpet.RegisterPetViewModel

class RegisterPetFragment : BaseFragment<FragmentRegisterPetBinding, RegisterPetViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentRegisterPetBinding {
        return FragmentRegisterPetBinding.inflate(inflater!!)
    }

    override val viewModel: RegisterPetViewModel by viewModels()

    override fun onInitViews() {
        binding.btRegisterPet.setOnClickListener {
            //chamar repository p/ salvar no banco de dados
        }
    }

    override fun onInitObservers() {}
}