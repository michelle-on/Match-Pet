package com.example.matchpet.screen.loginmain

import androidx.fragment.app.Fragment
import com.example.matchpet.base.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginMainActivity : BaseActivity() {
    override fun getFragment(): Fragment {
        return LoginMainFragment()
    }
}