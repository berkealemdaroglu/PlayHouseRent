package com.ersinberkealemdaroglu.playhouserent.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.playhouserent.R
import com.ersinberkealemdaroglu.playhouserent.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginStatusChange()
        loginController()
    }


    private fun loginStatusChange() {

        binding.landlordImageButton.setOnClickListener {
            if (binding.landlordImageButton.isPressed) {
                binding.apply {
                    tenantButton.visibility = View.INVISIBLE
                    tenantText.visibility = View.INVISIBLE
                    tenantText2.visibility = View.VISIBLE
                    tenantButton2.visibility = View.VISIBLE

                    //landlord
                    landlordImageButton.visibility = View.INVISIBLE
                    landlordText.visibility = View.INVISIBLE
                    landlordImageButton2.visibility = View.VISIBLE
                    landlordText2.visibility = View.VISIBLE

                    //button
                    binding.tenantLogic.visibility = View.INVISIBLE
                    binding.landlordLogic.visibility = View.VISIBLE
                }
            }
        }

        binding.tenantButton2.setOnClickListener {
            if (binding.tenantButton2.isPressed) {
                binding.apply {
                    tenantButton.visibility = View.VISIBLE
                    tenantText.visibility = View.VISIBLE
                    tenantText2.visibility = View.INVISIBLE
                    tenantButton2.visibility = View.INVISIBLE

                    //landlord
                    landlordImageButton.visibility = View.VISIBLE
                    landlordText.visibility = View.VISIBLE
                    landlordImageButton2.visibility = View.INVISIBLE
                    landlordText2.visibility = View.INVISIBLE

                    //button
                    binding.tenantLogic.visibility = View.VISIBLE
                    binding.landlordLogic.visibility = View.INVISIBLE
                }
            }
        }
    }

    private fun loginController() {

        binding.landlordLogic.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_landlordSignUpContinuedFragment)
        }

        binding.tenantLogic.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

    }

}