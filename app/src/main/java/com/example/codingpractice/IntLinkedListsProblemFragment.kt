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
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonRotateList.setOnClickListener {
            val url = "https://leetcode.com/problems/rotate-list/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonPartitionList.setOnClickListener {
            val url = "https://leetcode.com/problems/partition-list/"
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
