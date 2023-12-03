package com.example.codingpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.databinding.FragmentIntermediateTreesBinding
import androidx.navigation.fragment.findNavController
import android.content.Intent
import android.net.Uri

class IntTreesProblemFragment : Fragment() {
    private var _binding: FragmentIntermediateTreesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntermediateTreesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGo.setOnClickListener {
            val url = "https://leetcode.com/problems/insert-into-a-binary-search-tree/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonBinaryTreeRightSideView.setOnClickListener {
            val url = "https://leetcode.com/problems/binary-tree-right-side-view/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonTrimABinarySearchTree.setOnClickListener {
            val url = "https://leetcode.com/problems/trim-a-binary-search-tree/"
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
