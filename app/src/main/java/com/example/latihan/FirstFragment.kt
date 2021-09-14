package com.example.latihan

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_to_fragment.*
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    private var name: String? = null

    companion object{
        const val ARGS_PARAMS = "PARAMS"
        fun newInstance(name: String): FirstFragment {
            val myFirstFragment = FirstFragment()
            val bundle = Bundle().apply {
                putString(ARGS_PARAMS,name)
            }
            myFirstFragment.arguments = bundle
            return myFirstFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        name = arguments?.getString(ARGS_PARAMS)
        Log.d("Activity to Fragment","$name")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            text_fragment.text = name

    }
}