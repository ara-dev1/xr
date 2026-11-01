package com.apkforge.feasibility

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleView = findViewById<TextView>(R.id.textTitle)
        val counterView = findViewById<TextView>(R.id.textCounter)
        val clickButton = findViewById<Button>(R.id.buttonAction)

        titleView.text = getString(R.string.title_text)
        updateCounter(counterView)

        clickButton.setOnClickListener {
            clickCount++
            updateCounter(counterView)
        }
    }

    private fun updateCounter(view: TextView) {
        view.text = getString(R.string.counter_format, clickCount)
    }
}
