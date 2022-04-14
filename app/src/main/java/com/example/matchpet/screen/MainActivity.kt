package com.example.matchpet.screen

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.matchpet.R
import com.example.matchpet.base.BaseActivity
import com.example.matchpet.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun setContentView(unit: Any?): Int = R.layout.activity_main
    var fragment: Fragment? = null



    override fun bindingInflater(inflater: LayoutInflater?): ActivityMainBinding? {
        return inflater?.let { ActivityMainBinding.inflate(it) }
    }

    override fun initViews() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btNavigationView = binding?.btNavGraph
         val navController = findNavController(R.id.fragmentContainerView)

        val appBarConfigurations = AppBarConfiguration(setOf(R.id.home, R.id.addPet, R.id.favorite, R.id.profile))
//        setupActionBarWithNavController(navController, appBarConfigurations)

        btNavigationView?.setupWithNavController(navController)

    }

}