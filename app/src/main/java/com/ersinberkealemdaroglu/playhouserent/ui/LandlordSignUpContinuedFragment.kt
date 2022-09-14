package com.ersinberkealemdaroglu.playhouserent.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.playhouserent.R
import com.ersinberkealemdaroglu.playhouserent.databinding.FragmentLandlordSignUpContinuedBinding

class LandlordSignUpContinuedFragment : Fragment() {
    private lateinit var binding: FragmentLandlordSignUpContinuedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLandlordSignUpContinuedBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        landlordSignUpCompletedButton()
    }

    private fun landlordSignUpCompletedButton() {
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_landlordSignUpContinuedFragment_to_homeFragment)
        }
    }

}