package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentBeginnerStringsBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID

class BegStringsProblemFragment : Fragment() {
    private var _binding: FragmentBeginnerStringsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBeginnerStringsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/reverse-bits"
            val action = BegStringsProblemFragmentDirections.actionBegStringsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Reverse Bits", url)
            findNavController().navigate(action)
        }

        binding.buttonPalindromeNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/palindrome-number"
            val action = BegStringsProblemFragmentDirections.actionBegStringsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Palindrome Number", url)
            findNavController().navigate(action)
        }

        binding.buttonValidPalindrome.setOnClickListener {
            val url = "https://leetcode.com/problems/valid-palindrome"
            val action = BegStringsProblemFragmentDirections.actionBegStringsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Valid Palindrome", url)
            findNavController().navigate(action)
        }

        binding.buttonLongestPalindrome.setOnClickListener {
            val url = "https://leetcode.com/problems/longest-palindrome"
            val action = BegStringsProblemFragmentDirections.actionBegStringsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Longest Palindrome", url)
            findNavController().navigate(action)
        }

        binding.buttonFizzBuzz.setOnClickListener {
            val url = "https://leetcode.com/problems/fizz-buzz"
            val action = BegStringsProblemFragmentDirections.actionBegStringsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Fizz Buzz", url)
            findNavController().navigate(action)
        }

        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
