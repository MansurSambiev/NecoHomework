package com.example.necohomework

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val bad = 0..3
    private val normal = 4..6
    private val nice = 7..9
    private val excellent = 10
    private val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    private val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    private val badArray = ArrayList<String>()
    private val normalArray = ArrayList<String>()
    private val niceArray = ArrayList<String>()
    private val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for (index in nameArray.indices){
            if (gradeArray[index] in bad) badArray.add("${nameArray[index]} - ${gradeArray[index]}")
            if (gradeArray[index] in normal) normalArray.add("${nameArray[index]} - ${gradeArray[index]}")
            if (gradeArray[index] in nice) niceArray.add("${nameArray[index]} - ${gradeArray[index]}")
            if (gradeArray[index] == excellent) excellentArray.add("${nameArray[index]} - ${gradeArray[index]}")
        }
        badArray.forEach{Log.d("MyLog", "Плохие оценки: Ученик: $it")}
        normalArray.forEach {Log.d("MyLog", "Нормальные оценки: Ученик: $it")}
        niceArray.forEach {Log.d("MyLog", "Хорошие оценки: Ученик: $it")}
        excellentArray.forEach {Log.d("MyLog", "Отличные оценки: Ученик: $it")}

    }
}