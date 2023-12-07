package com.example.codingpractice

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.codingpractice.databinding.FragmentProblemDetailBinding
import kotlinx.coroutines.launch
import java.util.Date

private const val TAG = "ProblemDetailFragment"
private const val DATE_FORMAT = "EEE, MMM, dd"
class ProblemDetailFragment: Fragment() {
    private var _binding: FragmentProblemDetailBinding? = null

    private val binding
        get() = checkNotNull(_binding){
            "Cannot access binding because it is null. Is this view visible?"
        }
    private val args: ProblemDetailFragmentArgs by navArgs()
    private val problemDetailViewModel: ProblemDetailViewModel by viewModels{
        ProblemDetailViewModelFactory(args.problemId, args.title, args.url)
    }
    private val selectSendTo = registerForActivityResult(
        ActivityResultContracts.PickContact()
    ){uri: Uri?->
        uri?.let{parseContactSelection(it)}
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProblemDetailBinding.inflate(layoutInflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply{
            problemTitle.setText(args.title)
            problemSendTo.setOnClickListener {
                selectSendTo.launch(null)
            }
            problemUrl.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(args.url)
            startActivity(intent)
            }
            problemUrl.text = args.url
            problemSendTo.text = "Send To"
            val selectSendToIntent = selectSendTo.contract.createIntent(requireContext(),null)
            problemSendTo.isEnabled = canResolveIntent(selectSendToIntent)
        }
        viewLifecycleOwner.lifecycleScope.launch{
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED){
                problemDetailViewModel.problem.collect{problem->
                    problem?.let{updateUi(it)}
                }
            }
        }
        setFragmentResultListener(
            DatePickerFragment.REQUEST_KEY_DATE
        ){_, bundle ->
            val newDate = bundle.getSerializable(DatePickerFragment.BUNDLE_KEY_DATE) as Date
            problemDetailViewModel.updateProblem { it.copy(date=newDate) }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun updateUi(problem: Problem){
        binding.apply{
            problemTitle.setText(args.title)
            problemSendTo.text = problem.sendTo.ifEmpty{
                getString(R.string.problem_sendTo)
            }
        }
    }
    @SuppressLint("StringFormatInvalid")
    private fun getProblemReport(problem: Problem):String{
        return args.url
    }
    private fun parseContactSelection(contactUri: Uri){
        val queryFields = arrayOf(ContactsContract.Contacts.DISPLAY_NAME)
        val queryCursor = requireActivity().contentResolver.query(contactUri, queryFields, null, null, null)
        queryCursor?.use{cursor->
            if(cursor.moveToFirst()){
                val sendTo = cursor.getString(0)
                problemDetailViewModel.updateProblem { oldProblem->
                    oldProblem.copy(sendTo = sendTo)
                }
            }

        }
    }
    private fun canResolveIntent(intent: Intent): Boolean{
        val packageManager: PackageManager = requireActivity().packageManager
        val resolvedActivity: ResolveInfo? =
            packageManager.resolveActivity(
                intent,
                PackageManager.MATCH_DEFAULT_ONLY
            )
        return resolvedActivity != null
    }
}