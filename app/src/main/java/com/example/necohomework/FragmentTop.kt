package com.example.necohomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.necohomework.databinding.FragmentTopBinding

class FragmentTop : Fragment() {
    lateinit var binding: FragmentTopBinding
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btSendAct.setOnClickListener {
            dataModel.messageForActivity.value = "Hello to activity from fragment TOP"
        }

        binding.btSendTop.setOnClickListener {
            dataModel.messageForFragmentBottom.value = "Hello from fragment TOP"
        }

        dataModel.messageForFragmentTop.observe(activity as LifecycleOwner) {
            binding.tvMessageTop.text = it
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = FragmentTop()
    }
}