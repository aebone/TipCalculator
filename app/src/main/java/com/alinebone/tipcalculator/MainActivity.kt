package com.alinebone.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener{
            var bill = billText.text.toString().toDouble()
            var percentage = percentageText.text.toString().toDouble()

            var tip = bill * (percentage/100)
            var total = bill + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip)} | Total: ${doubleToDollar(total)}"
        }
    }

    private fun doubleToDollar(value: Double) : String {
        return "$ " + String.format("%.2f", value)
    }
}
