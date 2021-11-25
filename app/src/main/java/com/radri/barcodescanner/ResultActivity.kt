package com.radri.barcodescanner

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("barcodeRawValue")
            findViewById<TextView>(R.id.scannedBarcodeValueText).text = value
        }
    }
}