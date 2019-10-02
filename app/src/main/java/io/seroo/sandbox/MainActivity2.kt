package io.seroo.sandbox

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(PARENT_TAG, "$TAG onCreate")
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