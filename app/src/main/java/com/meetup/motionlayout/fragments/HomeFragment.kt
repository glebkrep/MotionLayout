package com.meetup.motionlayout.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.meetup.motionlayout.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_basic_motion.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_basicMotionFragment)
        }
        btn_keyframes.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_keyFramesFragment)
        }
        btn_keycycle.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_keyCycleFragment)
        }
        btn_scrollview.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_scrollViewFragment)
        }
        btn_not_child.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_notDirectChildFragment)
        }

    }
}
