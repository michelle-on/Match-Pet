package com.example.matchpet.screen.favorite

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.matchpet.adapter.PetAdapter
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.data.model.pet.Pet
import com.example.matchpet.databinding.FragmentFavoriteBinding


class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {

    override fun bindingInflater(inflater: LayoutInflater?): FragmentFavoriteBinding {
        return FragmentFavoriteBinding.inflate(inflater!!)
    }

    override val viewModel: FavoriteViewModel by viewModels()

    override fun onInitViews() {
        val listPet = listOf<Pet>(
            Pet(
                null,
                "Wes",
                "Macho",
                "Jovem",
                "Vira-lata",
                "Medio",
                "Muito Docil e carinhoso",
                null,
                null,
                "São Paulo",
                "Gato"
            ),
            Pet(
                null,
                "Jack",
                "Macho",
                "Filhote",
                "Vira-lata",
                "Medio",
                "Medroso, mas agitado ao mesmo tempo",
                null,
                null,
                "São Paulo",
                "Gato"
            )
        )

        val petAdapter = PetAdapter(listPet)

        binding.rvPet.adapter = petAdapter
    }

    override fun onInitObservers() {

    }
}