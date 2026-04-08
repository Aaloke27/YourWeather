package com.example.yourweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.yourweather.ui.theme.YourWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YourWeatherTheme {
                    WeatherApp(WeatherAppViewModel(repository = RetrofitInstance))
            }
        }
    }
}

