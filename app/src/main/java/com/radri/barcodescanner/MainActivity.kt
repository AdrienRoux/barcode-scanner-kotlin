package com.radri.barcodescanner

import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.scannerButton)

        button.setOnClickListener { // Perform action on click
            LiveBarcodeScanningActivity.requestStartScanner(
                this,
                ResultActivity(),
                button,
                requestPermissionLauncher
            )
        }
    }
}