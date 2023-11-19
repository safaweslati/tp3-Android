package com.tp.tp3.ui.theme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tp.tp3.R

private const val IS_DIGITAL = "digitalOK"
class FragmentClock : Fragment() {
    // TODO: Rename and change types of parameters
    private var digitalClock = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            digitalClock = it.getBoolean(IS_DIGITAL)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return if (!digitalClock)
            inflater.inflate(R.layout.frag_numeric, container, false)
        else
            inflater.inflate(R.layout.frag_digital, container, false)
    }
}
