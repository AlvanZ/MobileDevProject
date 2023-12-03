package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateQueuesBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri

class IntQueuesProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateQueuesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateQueuesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/flatten-nested-list-iterator"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonFrontMiddleBackQueue.setOnClickListener {
            val url = "https://leetcode.com/problems/design-front-middle-back-queue"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonMaximumSumCircularSubArray.setOnClickListener {
            val url = "https://leetcode.com/problems/maximum-sum-circular-subarray"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
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
