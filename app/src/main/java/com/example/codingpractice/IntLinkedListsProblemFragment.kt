package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateLinkedlistsBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID

class IntLinkedListsProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateLinkedlistsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateLinkedlistsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGoSortList.setOnClickListener {
            val url = "https://leetcode.com/problems/sort-list/"
            val action = IntLinkedListsProblemFragmentDirections.actionIntLinkedListsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Sort List", url)
            findNavController().navigate(action)
        }

        binding.buttonRotateList.setOnClickListener {
            val url = "https://leetcode.com/problems/rotate-list/"
            val action = IntLinkedListsProblemFragmentDirections.actionIntLinkedListsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Rotate List", url)
            findNavController().navigate(action)
        }

        binding.buttonPartitionList.setOnClickListener {
            val url = "https://leetcode.com/problems/partition-list/"
            val action = IntLinkedListsProblemFragmentDirections.actionIntLinkedListsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Partition List", url)
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
