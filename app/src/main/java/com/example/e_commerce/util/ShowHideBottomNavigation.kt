package com.example.e_commerce.util

import androidx.fragment.app.Fragment
import com.example.e_commerce.R
import com.example.e_commerce.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}