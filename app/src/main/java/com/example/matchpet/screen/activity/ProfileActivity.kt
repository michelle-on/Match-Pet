package com.example.matchpet.screen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityMainBinding
import com.example.matchpet.databinding.ActivitySettingsBinding

class ProfileActivity : BaseActivity<ActivitySettingsBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_settings
    var fragment: Fragment? = null

    override fun bindingInflater(inflater: LayoutInflater?): ActivitySettingsBinding? {
        return inflater?.let { ActivitySettingsBinding.inflate(it) }

    }

    override fun initViews() {

    }
}