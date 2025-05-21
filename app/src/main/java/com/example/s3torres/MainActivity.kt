package com.example.s3torres

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOrdenamiento).setOnClickListener {
            startActivity(Intent(this, OrdenamientoActivity::class.java))
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        findViewById<Button>(R.id.btnCalc).setOnClickListener {
            startActivity(Intent(this, CalculadoraActivity::class.java))
        }

        findViewById<Button>(R.id.btnMatricula).setOnClickListener {
            startActivity(Intent(this, MatriculaActivity::class.java))
        }

        findViewById<Button>(R.id.btnAsistencia).setOnClickListener {
            startActivity(Intent(this, AsistenciaActivity::class.java))
        }
    }
}
