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
import java.util.UUID

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
            val action = IntQueuesProblemFragmentDirections.actionIntQueuesProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Flatten Nested List Iterator", url)
            findNavController().navigate(action)
        }

        binding.buttonFrontMiddleBackQueue.setOnClickListener {
            val url = "https://leetcode.com/problems/design-front-middle-back-queue"
            val action = IntQueuesProblemFragmentDirections.actionIntQueuesProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Design Front Middle Back Queue", url)
            findNavController().navigate(action)
        }

        binding.buttonMaximumSumCircularSubArray.setOnClickListener {
            val url = "https://leetcode.com/problems/maximum-sum-circular-subarray"
            val action = IntQueuesProblemFragmentDirections.actionIntQueuesProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Maximum Sum Circular Subarray", url)
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
