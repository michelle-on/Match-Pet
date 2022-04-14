package com.example.matchpet.screen.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.matchpet.Pet
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityAddPetBinding
import com.example.matchpet.db.DataBase
import com.example.matchpet.screen.fragment.AddPetFragment

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