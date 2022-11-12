package com.example.necohomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}