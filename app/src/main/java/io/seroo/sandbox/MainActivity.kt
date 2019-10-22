package io.seroo.sandbox

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

const val PARENT_TAG = "lifecycle-test"

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(PARENT_TAG, "$TAG onCreate")

        btn_show_dialog.setOnClickListener {
            AlertDialog.Builder(this@MainActivity)
                .setTitle("This is a dialog")
                .setMessage("This is a dialog")
                .setPositiveButton("Ok") { _, _ -> }
                .setNegativeButton("No", null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }

        btn_show_full_screen_dialog.setOnClickListener {
            AlertDialog.Builder(
                this@MainActivity,
                android.R.style.Theme_Black_NoTitleBar_Fullscreen
            )
                .setTitle("This is a dialog2")
                .setMessage("This is a dialog2")
                .setPositiveButton("Ok") { _, _ -> }
                .setNegativeButton("No", null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }

        btn_show_dialog_fragment.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(DialogFragment(), DialogFragment.TAG)
                .commitAllowingStateLoss()
        }

        btn_move_to_main_activity2.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }

        btn_move_to_navigation_activity.setOnClickListener {
            startActivity(Intent(this@MainActivity, NavigationTestActivity::class.java))
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(PARENT_TAG, "$TAG onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(PARENT_TAG, "$TAG onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(PARENT_TAG, "$TAG onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(PARENT_TAG, "$TAG onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(PARENT_TAG, "$TAG onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(PARENT_TAG, "$TAG onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d(PARENT_TAG, "$TAG onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d(PARENT_TAG, "$TAG onRestoreInstanceState")
    }
}
