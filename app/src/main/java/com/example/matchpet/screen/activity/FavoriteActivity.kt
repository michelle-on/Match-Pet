package com.example.matchpet.screen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityAddPetBinding
import com.example.matchpet.databinding.ActivityFavoriteBinding

class FavoriteActivity : BaseActivity<ActivityFavoriteBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_favorite
    var fragment: Fragment? = null

    override fun bindingInflater(inflater: LayoutInflater?): ActivityFavoriteBinding? {
        return inflater?.let { ActivityFavoriteBinding.inflate(it) }
    }

    override fun initViews() {

    }
}