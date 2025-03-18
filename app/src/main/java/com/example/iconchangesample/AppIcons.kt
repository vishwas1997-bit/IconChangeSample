package com.example.iconchangesample
import androidx.annotation.DrawableRes

data class AppIcon(
    val id : String,
    val component: String,
    @DrawableRes
    val foregroundResource: Int
)

val appIcons : List<AppIcon> = listOf(
    AppIcon(
        id = "default",
        component = "com.example.iconchangesample.MainActivity",
        foregroundResource = R.mipmap.ic_launcher_default
    ),
    AppIcon(
        id = "smile",
        component = "com.example.iconchangesample.MainActivitySmile",
        foregroundResource = R.mipmap.ic_launcher_smile
    ),
    AppIcon(
        id = "tongue",
        component = "com.example.iconchangesample.MainActivityTongue",
        foregroundResource = R.mipmap.ic_launcher_tongue
    ),
    AppIcon(
        id = "sad",
        component = "com.example.iconchangesample.MainActivitySad",
        foregroundResource = R.mipmap.ic_launcher_sad
    )
)