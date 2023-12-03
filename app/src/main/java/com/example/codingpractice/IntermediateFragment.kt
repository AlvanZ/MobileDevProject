package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.codingpractice.databinding.FragmentIntermediateBinding

class IntermediateFragment : Fragment() {

    private var _binding: FragmentIntermediateBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to IntHashingProblemFragment
        binding.buttonOpenHashing.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntHashingProblemFragment()
            findNavController().navigate(action)
        }

        // Navigate to IntHeapsProblemFragment
        binding.buttonOpenHeaps?.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntHeapsProblemFragment()
            findNavController().navigate(action)
        }

        // Navigate to IntLinkedListsProblemFragment
        binding.buttonOpenLinkedlists?.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntLinkedListsProblemFragment()
            findNavController().navigate(action)
        }
        // Navigate to IntQueuesProblemFragment
        binding.buttonOpenQueues?.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntQueuesProblemFragment()
            findNavController().navigate(action)
        }

        // Navigate to IntStacksroblemFragment
        binding.buttonOpenStacks?.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntStacksProblemFragment()
            findNavController().navigate(action)
        }

        // Navigate to IntTreesProblemFragment
        binding.buttonOpenTrees?.setOnClickListener {
            val action = IntermediateFragmentDirections.actionIntermediateFragmentToIntTreesProblemFragment()
            findNavController().navigate(action)
        }

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
