package com.example.s3torres

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AsistenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asistencia)

        val codigo = findViewById<EditText>(R.id.etCodigo)
        val nombre = findViewById<EditText>(R.id.etNombre)
        val resultado = findViewById<TextView>(R.id.tvResultado)
        val btn = findViewById<Button>(R.id.btnRegistrarAsistencia)

        btn.setOnClickListener {
            val cod = codigo.text.toString()
            val nom = nombre.text.toString()

            if (cod.isNotEmpty() && nom.isNotEmpty()) {
                resultado.text = "Asistencia registrada:\n$cod - $nom"
            } else {
                resultado.text = "Faltan datos"
            }
        }
    }
}
