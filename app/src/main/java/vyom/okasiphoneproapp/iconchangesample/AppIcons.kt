package vyom.okasiphoneproapp.iconchangesample

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
        component = "vyom.okasiphoneproapp.iconchangesample.MainActivity",
        foregroundResource = R.mipmap.ic_launcher_default
    ),
    AppIcon(
        id = "smile",
        component = "vyom.okasiphoneproapp.iconchangesample.MainActivitySmile",
        foregroundResource = R.mipmap.ic_launcher_smile
    ),
    AppIcon(
        id = "tongue",
        component = "vyom.okasiphoneproapp.iconchangesample.MainActivityTongue",
        foregroundResource = R.mipmap.ic_launcher_tongue
    ),
    AppIcon(
        id = "sad",
        component = "vyom.okasiphoneproapp.iconchangesample.MainActivitySad",
        foregroundResource = R.mipmap.ic_launcher_sad
    )
)