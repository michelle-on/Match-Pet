package com.example.matchpet.screen.splash

import android.os.Looper
import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.matchpet.R
import com.example.matchpet.base.fragment.BaseFragment
import com.example.matchpet.databinding.FragmentSplashBinding
import com.example.matchpet.util.ImageUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.logging.Handler

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {

    override fun bindingInflater(inflater: LayoutInflater?): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater!!)
    }

    override val viewModel: SplashViewModel by viewModels()

    override fun onInitViews() {
        setupSplash()
    }

    private fun setupSplash() {
        ImageUtils.setImageGlide(binding.ivLogo, R.drawable.logo_app)

        lifecycleScope.launch {
            delay(2000)
            findNavController().navigate(
                SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            )
        }

    }

    override fun onInitObservers() {}
}
