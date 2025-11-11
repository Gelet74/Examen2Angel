package com.example.examen2angel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.examen2angel.ui.ExamenApp
import com.example.examen2angel.ui.theme.Examen2AngelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen2AngelTheme {

                    ExamenApp()

            }
        }
    }
}

