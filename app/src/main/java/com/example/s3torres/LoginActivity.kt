package com.example.s3torres

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private val usuarioValido = "admin@correo.com"
    private val claveValida = "123456"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val correo = findViewById<EditText>(R.id.etCorreo)
        val password = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val mensaje = findViewById<TextView>(R.id.tvMensaje)

        btnLogin.setOnClickListener {
            val inputCorreo = correo.text.toString().trim()
            val inputPassword = password.text.toString().trim()

            if (inputCorreo == usuarioValido && inputPassword == claveValida) {
                mensaje.text = "Login exitoso ✅"
            } else {
                mensaje.text = "Credenciales incorrectas ❌"
            }
        }
    }
}
