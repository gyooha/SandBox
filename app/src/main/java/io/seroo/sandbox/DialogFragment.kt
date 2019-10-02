package io.seroo.sandbox

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.DialogFragment

class DialogFragment: AppCompatDialogFragment() {
    companion object {
        const val TAG = "DialogFragment"
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        Log.d(PARENT_TAG, "$TAG onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen)
        Log.d(PARENT_TAG, "$TAG onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(PARENT_TAG, "$TAG onCreateView")
        return inflater.inflate(R.layout.dialog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(PARENT_TAG, "$TAG onViewCreate")
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d(PARENT_TAG, "$TAG onSaveInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d(PARENT_TAG, "$TAG onViewStateRestored")
    }
}