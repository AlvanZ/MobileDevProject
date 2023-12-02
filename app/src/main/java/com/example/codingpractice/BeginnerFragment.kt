package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.codingpractice.databinding.FragmentBeginnerBinding

class BeginnerFragment : Fragment() {

    private var _binding: FragmentBeginnerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBeginnerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to BegArraysProblemFragment
        binding.buttonOpenProblem.setOnClickListener {
            val action = BeginnerFragmentDirections.actionBeginnerFragmentToBegArraysProblemFragment()
            findNavController().navigate(action)
        }

        // Navigate to BegStringsProblemFragment
        binding.buttonOpenStrings?.setOnClickListener {
            val action = BeginnerFragmentDirections.actionBeginnerFragmentToBegStringsProblemFragment()
            findNavController().navigate(action)
        }

        binding.buttonOpenHashing?.setOnClickListener {
            val action = BeginnerFragmentDirections.actionBeginnerFragmentToBegHashingProblemFragment()
            findNavController().navigate(action)
        }

        // Other buttons and actions can be defined similarly

        // Back button action
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
