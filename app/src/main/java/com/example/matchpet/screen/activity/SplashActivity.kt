package com.example.matchpet.screen.activity

import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivitySplashBinding
import com.example.matchpet.util.ImageUtils

class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_splash
    override fun bindingInflater(inflater: LayoutInflater?): ActivitySplashBinding? {
        return inflater?.let { ActivitySplashBinding.inflate(it) }
    }

    override fun initViews() {
        ImageUtils.setImageGlide(binding?.ivLogo, R.drawable.logo_app)
        showLogin()
    }

    private fun showLogin() {
        val intent = Intent(this, LoginActivity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 2300)
    }

    private fun Intent.change() {
        startActivity(this)
        finish()
    }


}
