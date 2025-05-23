package vcmsa.ci.calculatorxx

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1EditText = findViewById<EditText>(R.id.number1)
        val number2EditText = findViewById<EditText>(R.id.number2)
        val resultTextView = findViewById<TextView>(R.id.resultTextview)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val num1 = number1EditText.text.toString().toDoubleOrNull()
            val num2 = number2EditText.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 + num2
                resultTextView.text = "Result: $result"
            } else {
                resultTextView.text = "please enter valid numbers"
            }
        }
        subtractButton.setOnClickListener {
            val num1 = number1EditText.text.toString().toDoubleOrNull()
            val num2 = number2EditText.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 - num2
                resultTextView.text = "Result : $result"
            } else {
                resultTextView.text = "please enter valid numbers"
            }
        }
        multiplyButton.setOnClickListener {
            val num1 = number1EditText.text.toString().toDoubleOrNull()
            val num2 = number2EditText.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 * num2
                resultTextView.text = "Result : $result"
            } else {
                resultTextView.text = "please enter valid numbers"
            }
        }
        divideButton.setOnClickListener {
            val num1 = number1EditText.text.toString().toDoubleOrNull()
            val num2 = number2EditText.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    resultTextView.text = "Result: $result"
                } else {
                    resultTextView.text = "cannot divide by zero"
                }
            } else {
                resultTextView.text = "please enter valid numbers."
            }

        }
    }
}