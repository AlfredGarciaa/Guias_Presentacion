package edu.bo.ucb.oneapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miboton1 = findViewById<View>(R.id.btn_servicios) as Button
        val miboton2 = findViewById<View>(R.id.btn_portafolio) as Button
        val miboton3 = findViewById<View>(R.id.btn_acerca) as Button
        val miboton4 = findViewById<View>(R.id.btn_contacto) as Button
        val miboton5 = findViewById<View>(R.id.btn_redes) as Button

        val mitexto = findViewById<View>(R.id.textView3) as TextView

        miboton1.setOnClickListener { mitexto.text = "Servicios" }
        miboton2.setOnClickListener { mitexto.text = "Portafolio" }
        miboton3.setOnClickListener { mitexto.text = "Acerca De" }
        miboton4.setOnClickListener { mitexto.text = "Contacto" }
        miboton5.setOnClickListener { mitexto.text = "Redes Sociales" }

        // Cambiar de Vista \\
        miboton1.setOnClickListener {
            startActivity(Intent(this, ServiciosActivity::class.java))
        }

        // Vista 2 \\
        val vista_2 = findViewById<View>(R.id.btn_ejercicio1) as Button
        vista_2.setOnClickListener {
            startActivity(Intent(this, Ejercicio_1::class.java))
        }
        // Vista 3 \\
        val vista_3 = findViewById<View>(R.id.btn_varios) as Button
        vista_3.setOnClickListener {
            startActivity(Intent(this, Ejercicios_Varios::class.java))
        }
    }
}