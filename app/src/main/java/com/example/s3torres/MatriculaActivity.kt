package com.example.s3torres

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MatriculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matricula)

        val codigo = findViewById<EditText>(R.id.etCodigo)
        val nombre = findViewById<EditText>(R.id.etNombre)
        val correo = findViewById<EditText>(R.id.etCorreo)
        val direccion = findViewById<EditText>(R.id.etDireccion)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val cod = codigo.text.toString()
            val nom = nombre.text.toString()
            val cor = correo.text.toString()
            val dir = direccion.text.toString()

            if (cod.isNotEmpty() && nom.isNotEmpty() && cor.isNotEmpty() && dir.isNotEmpty()) {
                resultado.text = "Matriculado:\n$cod - $nom\n$cor\n$dir"
            } else {
                resultado.text = "Faltan datos"
            }
        }
    }
}
