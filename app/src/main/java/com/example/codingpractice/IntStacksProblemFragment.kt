package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateStacksBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID

class IntStacksProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateStacksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateStacksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/min-stack/"
            val action = IntStacksProblemFragmentDirections.actionIntStacksProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Min Stack", url)
            findNavController().navigate(action)
        }

        binding.buttonOnlineStockSpan.setOnClickListener {
            val url = "https://leetcode.com/problems/online-stock-span/"
            val action = IntStacksProblemFragmentDirections.actionIntStacksProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Online Stock Span", url)
            findNavController().navigate(action)
        }

        binding.buttonDecodeString.setOnClickListener {
            val url = "https://leetcode.com/problems/decode-string/"
            val action = IntStacksProblemFragmentDirections.actionIntStacksProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Decode String", url)
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
