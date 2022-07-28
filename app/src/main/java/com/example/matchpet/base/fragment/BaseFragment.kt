package com.example.matchpet.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.matchpet.base.mvvm.BaseViewModel

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel> : Fragment(),
    BaseFragmentContract {

    abstract fun bindingInflater(inflater: LayoutInflater?): VB

    private var mViewBinding: VB? = null

    protected val binding: VB
        get() = mViewBinding as VB

    abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewBinding = bindingInflater(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInitObservers()
        onInitViews()
        activity?.supportFragmentManager?.popBackStack()
    }
}