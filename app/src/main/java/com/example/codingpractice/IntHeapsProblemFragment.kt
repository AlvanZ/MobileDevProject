package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateHeapsBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID

class IntHeapsProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateHeapsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateHeapsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGoCarPooling.setOnClickListener {
            val url = "https://leetcode.com/problems/car-pooling/"
            val action = IntHeapsProblemFragmentDirections.actionIntHeapsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Car Pooling", url)
            findNavController().navigate(action)
        }

        binding.buttonSortAnArray.setOnClickListener {
            val url = "https://leetcode.com/problems/sort-an-array"
            val action = IntHeapsProblemFragmentDirections.actionIntHeapsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Sort an Array", url)
            findNavController().navigate(action)
        }

        binding.buttonLongestHappyString.setOnClickListener {
            val url = "https://leetcode.com/problems/longest-happy-string/"
            val action = IntHeapsProblemFragmentDirections.actionIntHeapsProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Longest Happy String", url)
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
