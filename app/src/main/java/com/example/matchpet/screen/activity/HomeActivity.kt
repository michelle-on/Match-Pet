package com.example.matchpet.screen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityFavoriteBinding
import com.example.matchpet.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_home
    var fragment: Fragment? = null

    override fun bindingInflater(inflater: LayoutInflater?): ActivityHomeBinding? {
        return inflater?.let { ActivityHomeBinding.inflate(it) }
    }

    override fun initViews() {

    }
}