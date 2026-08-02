package com.vimax.control.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable


private val VimaxFerrariColors = darkColorScheme(

    primary = FerrariRed,
    onPrimary = PureWhite,

    secondary = FerrariGold,
    onSecondary = PureBlack,

    background = CarbonBlack,
    onBackground = PureWhite,

    surface = CockpitPanel,
    onSurface = PureWhite,

    error = AlarmRed,
    onError = PureWhite
)


@Composable
fun FerrariTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(

        colorScheme = VimaxFerrariColors,

        typography = VimaxTypography,

        content = content

    )
}