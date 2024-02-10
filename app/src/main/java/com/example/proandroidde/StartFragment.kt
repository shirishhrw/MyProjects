package com.example.proandroidde

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_start, container, false)

        val fragmentABtn: Button = root.findViewById(R.id.fragment_a_btn)
        val fragmentBBtn: Button = root.findViewById(R.id.fragment_b_btn)

        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController1 = navHostFragment.navController

//        navController1.graph = navController1.createGraph(
//            startDestination = "profile"
//        ) {
//            // Associate each destination with one of the route constants.
////            fragment<FragmentA>("profile") {
//////                label = "Profile"
////            }
////
////            fragment<FragmentB>("friendsList") {
//////                label = "Friends List"
////            }
//
//            // Add other fragment destinations similarly.
//        }

        fragmentABtn.setOnClickListener { button ->
            navController1.navigate(R.id.fragmentA)
        }

        fragmentBBtn.setOnClickListener { button ->
            navController1.navigate(R.id.fragmentB)
        }

        return root
    }
}