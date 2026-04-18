package com.example.yourweather

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun WeatherApp(viewModel: WeatherAppViewModel){

    val data = viewModel.weatherData
    val weather = data?.weather?.firstOrNull()?.description
//    var city by remember {mutableStateOf("")}
    LaunchedEffect(Unit) {
//
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF93BDD6),
                    Color(0xFFC5B494),
                    Color(0xFFD6A361)
                )))
    ) {

}
}

