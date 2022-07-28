package com.example.matchpet.screen.main

import androidx.fragment.app.Fragment
import com.example.matchpet.base.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun getFragment(): Fragment {
        return MainFragment()
    }

    /*    override fun setContentView(unit: Any?): Int = R.layout.activity_main
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

    }*/
}