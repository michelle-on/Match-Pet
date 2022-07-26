package com.example.matchpet.screen.activity.RegisterPet

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityAddPetBinding

class AddPetActivity : BaseActivity<ActivityAddPetBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_add_pet
    var fragment: Fragment? = null

    override fun bindingInflater(inflater: LayoutInflater?): ActivityAddPetBinding? {
        return inflater?.let { ActivityAddPetBinding.inflate(it) }
    }

    override fun initViews() {
//        supportFragmentManager.beginTransaction().replace(R.id.container, AddPetFragment()).commit()
    }
}