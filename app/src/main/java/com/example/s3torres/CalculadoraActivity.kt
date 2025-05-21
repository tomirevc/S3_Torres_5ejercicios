package com.example.s3torres

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val num1 = findViewById<EditText>(R.id.etNum1)
        val num2 = findViewById<EditText>(R.id.etNum2)
        val num3 = findViewById<EditText>(R.id.etNum3)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)

        fun obtenerValores(): List<Double>? {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()
            val n3 = num3.text.toString().toDoubleOrNull()
            return if (n1 != null && n2 != null && n3 != null) listOf(n1, n2, n3) else null
        }

        btnSumar.setOnClickListener {
            obtenerValores()?.let { (a, b, c) ->
                resultado.text = "Resultado: ${a + b + c}"
            } ?: run { resultado.text = "Valores inválidos" }
        }

        btnRestar.setOnClickListener {
            obtenerValores()?.let { (a, b, c) ->
                resultado.text = "Resultado: ${a - b - c}"
            } ?: run { resultado.text = "Valores inválidos" }
        }

        btnMultiplicar.setOnClickListener {
            obtenerValores()?.let { (a, b, c) ->
                resultado.text = "Resultado: ${a * b * c}"
            } ?: run { resultado.text = "Valores inválidos" }
        }

        btnDividir.setOnClickListener {
            obtenerValores()?.let { (a, b, c) ->
                if (b != 0.0 && c != 0.0)
                    resultado.text = "Resultado: ${a / b / c}"
                else
                    resultado.text = "No se puede dividir entre cero"
            } ?: run { resultado.text = "Valores inválidos" }
        }
    }
}
