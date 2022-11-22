package com.example.necohomework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val messageForActivity: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageForFragmentTop: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageForFragmentBottom: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}