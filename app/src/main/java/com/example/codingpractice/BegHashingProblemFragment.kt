package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentBeginnerHashingBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri
import java.util.UUID

class BegHashingProblemFragment : Fragment() {
    private var _binding: FragmentBeginnerHashingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBeginnerHashingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the "Go" button click listener
        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/design-hashmap/"
            val action = BegHashingProblemFragmentDirections.actionBegHashingProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Design Hashmap", url)
            findNavController().navigate(action)
        }

        binding.buttonDesignHashset.setOnClickListener {
            val url = "https://leetcode.com/problems/design-hashset/"
            val action = BegHashingProblemFragmentDirections.actionBegHashingProblemFragmentToProblemDetailFragment(
                UUID.randomUUID(), "Design Hashset", url)
            findNavController().navigate(action)
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
