package com.example.s3torres

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrdenamientoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordenamiento)

        val campos = listOf<EditText>(
            findViewById(R.id.et1), findViewById(R.id.et2),
            findViewById(R.id.et3), findViewById(R.id.et4), findViewById(R.id.et5)
        )

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btn = findViewById<Button>(R.id.btnOrdenar)

        btn.setOnClickListener {
            val numeros = campos.map { it.text.toString().toIntOrNull() ?: 0 }.toMutableList()
            // Burbuja
            for (i in 0 until numeros.size - 1) {
                for (j in 0 until numeros.size - i - 1) {
                    if (numeros[j] > numeros[j + 1]) {
                        val temp = numeros[j]
                        numeros[j] = numeros[j + 1]
                        numeros[j + 1] = temp
                    }
                }
            }
            tvResultado.text = "Ordenado: ${numeros.joinToString(", ")}"
        }
    }
}
