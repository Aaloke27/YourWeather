package com.example.yourweather.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Tan30,
    onPrimary = Tan80,
    primaryContainer = Beige20,
    onPrimaryContainer = Beige80,
    inversePrimary = Tan90,
    secondary = Brown20,
    onSecondary = Brown80,
    secondaryContainer = Brown30,
    onSecondaryContainer = Brown90,
    tertiary = DustyBlue20,
    onTertiary = DustyBlue80,
    tertiaryContainer = DustyBlue30,
    onTertiaryContainer = DustyBlue90,
    error = Grey30,
    onError = Grey90,
    errorContainer = Grey20,
    onErrorContainer = Grey80,
    surface = Black20,
    onSurface = Black80,
    inverseSurface = Black90,
    inverseOnSurface = Black10,
    surfaceVariant = White15,
    onSurfaceVariant = White85,
    outline = Black10
)

private val LightColorScheme = lightColorScheme(
    primary = Beige80,
    onPrimary = Beige30,
    primaryContainer = Tan80,
    onPrimaryContainer = Tan30,
    inversePrimary = Beige20,
    secondary = Brown90,
    onSecondary = Brown30,
    secondaryContainer = Brown80,
    onSecondaryContainer = Brown20,
    tertiary = DustyBlue80,
    onTertiary = DustyBlue20,
    tertiaryContainer = DustyBlue90,
    onTertiaryContainer = DustyBlue30,
    error = Grey90,
    onError = Grey30,
    errorContainer = Grey80,
    onErrorContainer = Grey20,
    surface = Black80,
    onSurface = Black20,
    inverseSurface = Black10,
    inverseOnSurface = Black90,
    surfaceVariant = White85,
    onSurfaceVariant = White15,
    outline = White100
)

@Composable
fun YourWeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = Typography,
        content = content
    )
}