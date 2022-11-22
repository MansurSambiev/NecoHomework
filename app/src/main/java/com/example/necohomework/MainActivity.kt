package com.example.necohomework

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.necohomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //    Создаем переменную для LifeCycle модели
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //  Заполняем FrameLayout фрагмаентами
        openFrag(FragmentTop.newInstance(), R.id.fragTop)
        openFrag(FragmentBottom.newInstance(), R.id.fragBottom)
        // Добавляем LifeCycle слушатель для текстового поля
        dataModel.messageForActivity.observe(this) { binding.tvMessageActivity.text = it }
    }
//  Функция для заполнения FrameLayout фрагмаентами
    private fun openFrag(f: Fragment, idHolder: Int){
        supportFragmentManager.beginTransaction().replace(idHolder, f).commit()
    }
}