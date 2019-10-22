package io.seroo.sandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class NavigationTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_test)
    }

    override fun onSupportNavigateUp(): Boolean =
        findNavController(R.id.fm_navigation).navigateUp()
}