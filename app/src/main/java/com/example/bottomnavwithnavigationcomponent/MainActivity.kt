package com.example.bottomnavwithnavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationItemView: BottomNavigationView = findViewById(R.id.bottomNav)
        val navController = findNavController(R.id.nav_host_fragment_home)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.categoryFragment,
                R.id.bookmarkFragment,
                R.id.profileFragment,
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationItemView.setupWithNavController(navController)
    }
}