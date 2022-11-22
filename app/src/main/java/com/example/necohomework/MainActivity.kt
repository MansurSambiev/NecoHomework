package com.example.necohomework

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.necohomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openFrag(FragmentTop.newInstance(), R.id.fragTop)
        openFrag(FragmentBottom.newInstance(), R.id.fragBottom)
        dataModel.messageForActivity.observe(this) { binding.tvMessageActivity.text = it }
    }

    private fun openFrag(f: Fragment, idHolder: Int){
        supportFragmentManager.beginTransaction().replace(idHolder, f).commit()
    }
}