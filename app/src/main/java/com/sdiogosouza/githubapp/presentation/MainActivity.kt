package com.sdiogosouza.githubapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sdiogosouza.githubapp.R.id.aboutMeFragment
import com.sdiogosouza.githubapp.R.id.nav_host_fragment_activity_main
import com.sdiogosouza.githubapp.R.id.userListFragment
import com.sdiogosouza.githubapp.R.id.userRepoFragment
import com.sdiogosouza.githubapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                userListFragment,
                userRepoFragment,
                aboutMeFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}