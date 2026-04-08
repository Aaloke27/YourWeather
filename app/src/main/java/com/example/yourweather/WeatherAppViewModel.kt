package com.example.yourweather

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WeatherAppViewModel (private val repository: RetrofitInstance): ViewModel(){
    var weatherData by mutableStateOf<WeatherResponse?>(null)
        private set

    fun FetchWeatherData(city: String){
        viewModelScope.launch {
            try {
            weatherData = repository.api.getWeather(city)
        }catch (e: Exception){
            e.printStackTrace()
           }
        }
    }
}