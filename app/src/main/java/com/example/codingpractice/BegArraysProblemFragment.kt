package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentSpecificProblemBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri

class BegArraysProblemFragment : Fragment() {
    private var _binding: FragmentSpecificProblemBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSpecificProblemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the "Go" button click listener
        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/two-sum/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonDistributeCandies.setOnClickListener {
            val url = "https://leetcode.com/problems/distribute-candies/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonSingleNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/single-number/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonMajorityElement.setOnClickListener {
            val url = "https://leetcode.com/problems/majority-element"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonMissingNumber.setOnClickListener {
            val url = "https://leetcode.com/problems/missing-number"
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
