package com.example.matchpet.screen.main

import androidx.fragment.app.Fragment
import com.example.matchpet.base.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun getFragment(): Fragment {
        return MainFragment()
    }
}