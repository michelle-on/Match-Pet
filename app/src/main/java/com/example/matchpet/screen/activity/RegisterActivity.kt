package com.example.matchpet.screen.activity

import android.content.Intent
import android.view.LayoutInflater
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityRegisterBinding
import com.example.matchpet.screen.MainActivity
import com.example.matchpet.util.ImageUtils

class RegisterActivity : BaseActivity<ActivityRegisterBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_register

    override fun bindingInflater(inflater: LayoutInflater?): ActivityRegisterBinding? {
        return inflater?.let { ActivityRegisterBinding.inflate(it) }
    }

    override fun initViews() {
        ImageUtils.setImageGlide(binding?.icDog, R.drawable.ic_dog)
        onLoginScreen()
        onRegisterUser()
    }

    private fun onLoginScreen() {
        binding?.tvLogin?.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun onRegisterUser() {
        binding?.btRegister?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}