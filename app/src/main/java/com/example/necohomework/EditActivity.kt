package com.example.necohomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.necohomework.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var imageId = R.drawable.plant
    private val imageList = listOf(
        R.drawable.plant,
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEditBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initButtons()
    }

    private fun initButtons() = with(binding){
        bNext.setOnClickListener {
            indexImage++
            if(indexImage == imageList.size) indexImage = 0
            imageId = imageList[indexImage]
            imageView.setImageResource(imageId)
        }

        bDone.setOnClickListener {
            val plant = Plant(imageId, edTitle.text.toString(), edDesc.text.toString())
            val editIntent = Intent().apply {
                putExtra("plant", plant)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}