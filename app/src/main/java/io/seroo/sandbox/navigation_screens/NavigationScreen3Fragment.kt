package io.seroo.sandbox.navigation_screens

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.seroo.sandbox.PARENT_TAG
import io.seroo.sandbox.R

class NavigationScreen3Fragment: Fragment() {

    companion object {
        private const val TAG = "NavigationScreen3Fragment"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(PARENT_TAG, "$TAG onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(PARENT_TAG, "$TAG onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_navigation_screen_3, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(PARENT_TAG, "$TAG onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.d(PARENT_TAG, "$TAG onActivityCreated")
    }

    override fun onPause() {
        super.onPause()

        Log.d(PARENT_TAG, "$TAG onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(PARENT_TAG, "$TAG onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d(PARENT_TAG, "$TAG onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(PARENT_TAG, "$TAG onDestroy")
    }

    override fun onDetach() {
        super.onDetach()

        Log.d(PARENT_TAG, "$TAG onDetach")
    }
}