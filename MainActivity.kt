package com.example.toastsample

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast.makeText	Создаёт базовое уведомление.
        //setGravity	Изменяет расположение Toast.
        //setView	Устанавливает кастомный вид.
        //setText	Меняет текст у уже существующего Toast.
        //duration	Устанавливает длительность (LENGTH_SHORT/LONG).
        //show()	Отображает уведомление на экране.
        // Отображаем Toast при запуске активности
        Toast.makeText(this, "Welcome to the app!", Toast.LENGTH_SHORT).show()
        
    }
}
