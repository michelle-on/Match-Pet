package com.example.matchpet.screen.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.matchpet.R
import com.example.matchpet.base.BaseFragment
import com.example.matchpet.databinding.FragmentFavoriteBinding


class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>() {
    override fun getLayoutResource(): Int = R.layout.fragment_favorite

    override fun bindingInflater(inflater: LayoutInflater?): FragmentFavoriteBinding? {
        return inflater?.let { FragmentFavoriteBinding.inflate(it) }
    }

    override fun onInitView() {
        Toast.makeText(this.context, "Favorite Fragment", Toast.LENGTH_SHORT).show()
    }

}