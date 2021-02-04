package com.example.subscribers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment : NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment;
        val navHostFragmentController : NavController = navHostFragment.navController;
        val appBarController : AppBarConfiguration = AppBarConfiguration(navHostFragmentController.graph);

        this.toolbar_app.setupWithNavController(navHostFragmentController, appBarController);


    }

}
