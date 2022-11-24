package com.example.necohomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.necohomework.databinding.ActivityContentBinding

class ContentActivity : AppCompatActivity() {
    lateinit var binding: ActivityContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val item = intent.getSerializableExtra("item") as Plant
        binding.apply {
            imMain.setImageResource(item.imageId)
            tvTitle.text = item.title
            tvContent.text = item.desc
        }
    }
}