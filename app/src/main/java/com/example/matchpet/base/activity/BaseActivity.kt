package com.example.matchpet.base.activity

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.matchpet.R
import com.google.android.gms.common.api.internal.LifecycleCallback.getFragment

abstract class BaseActivity : AppCompatActivity(), BaseActivityContract {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default_for_fragment)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDefault, getFragment())
            .commit()

        window.enterTransition = null
    }
}
