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

        // Set up the "Go" button click listener
        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/reverse-bits"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonPalindromeNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/palindrome-number"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonValidPalindrome.setOnClickListener {
            val url = "https://leetcode.com/problems/valid-palindrome"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonLongestPalindrome.setOnClickListener {
            val url = "https://leetcode.com/problems/longest-palindrome"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonFizzBuzz.setOnClickListener {
            val url = "https://leetcode.com/problems/fizz-buzz"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
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
