package com.example.matchpet.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected var binding: VB? = null

    abstract fun bindingInflater(inflater: LayoutInflater?): VB?

    abstract fun initViews()

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingInflater(layoutInflater)
        setContentView(binding?.root)
        initViews()
    }

    abstract fun setContentView(unit: Any?): Int
}
