package com.example.matchpet.screen.activity

import android.content.Intent
import android.view.LayoutInflater
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityLoginBinding
import com.example.matchpet.screen.MainActivity
import com.example.matchpet.util.ImageUtils

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_login

    override fun bindingInflater(inflater: LayoutInflater?): ActivityLoginBinding? {
        return inflater?.let { ActivityLoginBinding.inflate(it) }
    }

    override fun initViews() {
        ImageUtils.setImageGlide(binding?.icWelcome, R.drawable.img_welcome)
        onLogin()
        onRegisterScreen()
    }

    private fun onLogin() {
        binding?.btLogin?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun onRegisterScreen() {
        binding?.tvRegister?.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}