package com.angelaavalos.pdm124.ui.theme.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.angelaavalos.pdm124.R

@Composable
fun ComposeLottieAnimation(modifier: Modifier){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_lmfkds29))

    LottieAnimation(
        modifier = modifier,
        composition = composition,
        iterations = LottieConstants.IterateForever)

}
@Composable
fun ComposeLottieAnimation1(modifier: Modifier){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_lmfm1u8h))

    LottieAnimation(
        modifier = modifier,
        composition = composition,
        iterations = LottieConstants.IterateForever)

}