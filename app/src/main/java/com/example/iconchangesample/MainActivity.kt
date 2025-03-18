package com.example.iconchangesample

import android.content.ComponentName
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.iconchangesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnDefault.setOnClickListener { setAppIcon("default") }
        binding.btnSmile.setOnClickListener { setAppIcon("smile") }
        binding.btnTongue.setOnClickListener { setAppIcon("tongue") }
        binding.btnSad.setOnClickListener { setAppIcon("sad") }
    }

    private fun setAppIcon(iconId: String) {
        val icon = appIcons.find { it.id == iconId } ?: return
        val context = baseContext
        val packageManager = context.packageManager

        appIcons.filterNot { it.id == iconId }.forEach {
            packageManager.setComponentEnabledSetting(
                ComponentName(context, it.component),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
            )
        }

        packageManager.setComponentEnabledSetting(
            ComponentName(context, icon.component),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        )
    }
}