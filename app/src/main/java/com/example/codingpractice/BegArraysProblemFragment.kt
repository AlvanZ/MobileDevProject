package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import com.example.codingpractice.databinding.FragmentBeginnerArraysBinding
import java.util.Date
import java.util.UUID

class BegArraysProblemFragment : Fragment() {
    private var _binding: FragmentBeginnerArraysBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBeginnerArraysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set up the "Go" button click listener
        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/two-sum/"
            val action = BegArraysProblemFragmentDirections.actionBegArraysProblemFragmentToProblemDetailFragment2(
                UUID.randomUUID(), "Two Sum", url)
            findNavController().navigate(action)
        }

        binding.buttonDistributeCandies.setOnClickListener {
            val url = "https://leetcode.com/problems/distribute-candies/"
            val action = BegArraysProblemFragmentDirections.actionBegArraysProblemFragmentToProblemDetailFragment2(
                UUID.randomUUID(), "Distribute Candies", url)
            findNavController().navigate(action)

        }

        binding.buttonSingleNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/single-number/"
            val action = BegArraysProblemFragmentDirections.actionBegArraysProblemFragmentToProblemDetailFragment2(
                UUID.randomUUID(), "Single Number", url)
            findNavController().navigate(action)
        }

        binding.buttonMajorityElement.setOnClickListener {
            val url = "https://leetcode.com/problems/majority-element"
            val action = BegArraysProblemFragmentDirections.actionBegArraysProblemFragmentToProblemDetailFragment2(
                UUID.randomUUID(), "Majority Element", url)
            findNavController().navigate(action)
        }

        binding.buttonMissingNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/missing-number"
            val action = BegArraysProblemFragmentDirections.actionBegArraysProblemFragmentToProblemDetailFragment2(
                UUID.randomUUID(), "Missing Number", url)
            findNavController().navigate(action)
        }

        // Set up the "Back" button click listener
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
