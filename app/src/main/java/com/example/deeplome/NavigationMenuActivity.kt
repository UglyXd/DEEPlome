package com.example.deeplome

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class NavigationMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_menue)  // Убедитесь, что имя файла указано правильно

        val button1: AppCompatButton = findViewById(R.id.button1)
        val button2: AppCompatButton = findViewById(R.id.button2)
        val button3: AppCompatButton = findViewById(R.id.button3)
        val button4: AppCompatButton = findViewById(R.id.button4)
        val exitButton: AppCompatButton = findViewById(R.id.exit_button)

        button1.setOnClickListener {
            Toast.makeText(this, "Нажата кнопка Инвентаризация", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this, "Нажата кнопка Приёмка", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this, "Нажата кнопка Отгрузка", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            Toast.makeText(this, "Нажата кнопка Переместить товар", Toast.LENGTH_SHORT).show()
        }

        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}
