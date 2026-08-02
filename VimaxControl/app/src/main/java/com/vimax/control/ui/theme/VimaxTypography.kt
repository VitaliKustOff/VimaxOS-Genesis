package com.vimax.control.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


val VimaxTypography = Typography(

    displayLarge = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.Bold,
        color = PureWhite
    ),

    headlineLarge = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = FerrariRed
    ),

    headlineMedium = TextStyle(
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        color = PureWhite
    ),

    titleLarge = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = FerrariGold
    ),

    bodyLarge = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        color = PureWhite
    ),

    bodyMedium = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = PureWhite
    ),

    labelLarge = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        color = PureBlack
    )
)