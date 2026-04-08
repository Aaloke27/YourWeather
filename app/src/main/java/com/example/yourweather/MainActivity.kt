package com.example.yourweather

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.yourweather.ui.theme.YourWeatherTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        lifecycleScope.launch {
            try {
                    val response = RetrofitInstance.api.getWeather(
                        city = "Khardah",
                        apiKey = "9b8b84ad66f1bf541ca765f68cb6be5f"
                    )
                    Log.d("weather", "city: ${response.name}")
                Log.d("weather, ", "temp: ${response.main}")
        }catch (e: Exception){
            e.printStackTrace()
        }
        }
        setContent {
            YourWeatherTheme {

            }
        }
    }
}

