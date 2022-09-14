package com.example.matchpet.screen.registerpet

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.data.model.pet.Pet
import com.example.matchpet.databinding.FragmentRegisterPetBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegisterPetFragment : BaseFragment<FragmentRegisterPetBinding, RegisterPetViewModel>() {
    override fun bindingInflater(inflater: LayoutInflater?): FragmentRegisterPetBinding {
        return FragmentRegisterPetBinding.inflate(inflater!!)
    }

    override val viewModel: RegisterPetViewModel by viewModels()

    override fun onInitViews() {
        val pet = Pet(
            null,
            binding.etPetName.text.toString(),
            binding.etSexPet.text.toString(),
            binding.etAgePet.text.toString(),
            binding.etBreedPet.text.toString(),
            binding.etSizePet.text.toString(),
            binding.etPetPersonality.text.toString(),
            binding.etPetHealth.text.toString(),
            binding.etPetCare.text.toString(),
            binding.etCityPet.text.toString(),
            binding.etTypePet.text.toString()
        )

        binding.btRegisterPet.setOnClickListener {
            viewModel.insertPet(pet)
            binding.pbLoader.visibility = View.VISIBLE
        }
    }

    override fun onInitObservers() {
        viewModel.petId.observe(this) {
            lifecycleScope.launch {
                delay(1000)
                binding.pbLoader.visibility = View.GONE
                //aparecer janela dizendo que foi finalizado
                Toast.makeText(context, it.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}