package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateHashingBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID


class IntHashingProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateHashingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateHashingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGoGroupAnagrams.setOnClickListener {
            val url = "https://leetcode.com/problems/group-anagrams/"
            val action = IntHashingProblemFragmentDirections.actionIntHashingProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Group Anagrams", url)
            findNavController().navigate(action)
        }

        binding.buttonValidSudoku.setOnClickListener {
            val url = "https://leetcode.com/problems/valid-sudoku/"
            val action = IntHashingProblemFragmentDirections.actionIntHashingProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Valid Sudoku", url)
            findNavController().navigate(action)
        }

        binding.buttonSortColors.setOnClickListener {
            val url = "https://leetcode.com/problems/sort-colors/"
            val action = IntHashingProblemFragmentDirections.actionIntHashingProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Sort Colors", url)
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
