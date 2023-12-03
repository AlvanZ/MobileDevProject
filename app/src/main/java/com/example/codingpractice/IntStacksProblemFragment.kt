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
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonOnlineStockSpan.setOnClickListener {
            val url = "https://leetcode.com/problems/online-stock-span/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        binding.buttonDecodeString.setOnClickListener {
            val url = "https://leetcode.com/problems/decode-string/"
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
