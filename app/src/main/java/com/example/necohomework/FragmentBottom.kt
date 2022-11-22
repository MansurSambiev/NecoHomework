package com.example.necohomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.necohomework.databinding.FragmentBottomBinding

class FragmentBottom : Fragment() {
    lateinit var binding: FragmentBottomBinding
    private val dataModel: DataModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btSendAct.setOnClickListener {
            dataModel.messageForActivity.value = "Hello to activity from fragment BOTTOM"
        }

        binding.btSendBottom.setOnClickListener {
            dataModel.messageForFragmentTop.value = "Hello from fragment BOTTOM"
        }

        dataModel.messageForFragmentBottom.observe(activity as LifecycleOwner){
            binding.tvMessageBottom.text = it
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = FragmentBottom()
    }
}