package com.example.matchpet.screen.favorite

import android.view.LayoutInflater
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentFavoriteBinding
import com.example.matchpet.screen.favorite.FavoriteViewModel


class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {

    override fun bindingInflater(inflater: LayoutInflater?): FragmentFavoriteBinding {
        return FragmentFavoriteBinding.inflate(inflater!!)
    }

    override val viewModel: FavoriteViewModel by viewModels()

    override fun onInitViews() {
        Toast.makeText(this.context, "Favorite Fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onInitObservers() {

    }
}