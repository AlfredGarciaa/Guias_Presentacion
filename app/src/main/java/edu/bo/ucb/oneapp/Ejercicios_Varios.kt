package edu.bo.ucb.oneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Ejercicios_Varios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_varios)

        // Instanciamos los componentes de la actividad \\
        val txtnumero1 = findViewById<View>(R.id.text_1) as EditText
        val txtnumero2 = findViewById<View>(R.id.text_2) as EditText
        val botonSumar = findViewById<View>(R.id.btn_sumar) as Button
        val botonRestar = findViewById<View>(R.id.btn_restar) as Button
        val botonMultiplicar = findViewById<View>(R.id.btn_multiplicar) as Button
        val botonDividir = findViewById<View>(R.id.btn_dividir) as Button
        val txtResultado = findViewById<View>(R.id.text_resultado) as TextView
        val botonReiniciar = findViewById<View>(R.id.btn_reiniciar) as Button

        var resultado:Long? = null
        //Sumar
        botonSumar.setOnClickListener{
            if ( txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty() ){
                resultado = txtnumero1.text.toString().toLong() + txtnumero2.text.toString().toLong()
                txtResultado.text = resultado.toString()
            }
            else {
                Toast.makeText(this, "Los dos campos son obligatorios", Toast.LENGTH_LONG).show()
            }
        }
        //Restar
        botonRestar.setOnClickListener{
            if ( txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty() ){
                resultado = txtnumero1.text.toString().toLong() - txtnumero2.text.toString().toLong()
                txtResultado.text = resultado.toString()
            }
            else {
                Toast.makeText(this, "Los dos campos son obligatorios", Toast.LENGTH_LONG).show()
            }
        }
        //Multiplicar
        botonMultiplicar.setOnClickListener{
            if ( txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty() ){
                resultado = txtnumero1.text.toString().toLong() * txtnumero2.text.toString().toLong()
                txtResultado.text = resultado.toString()
            }
            else {
                Toast.makeText(this, "Los dos campos son obligatorios", Toast.LENGTH_LONG).show()
            }
        }
        //Dividir
        botonDividir.setOnClickListener{
            if ( txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty() ){
                resultado = txtnumero1.text.toString().toLong() / txtnumero2.text.toString().toLong()
                txtResultado.text = resultado.toString()
            }
            else {
                Toast.makeText(this, "Los dos campos son obligatorios", Toast.LENGTH_LONG).show()
            }
        }
        //Limpiar pantalla
        botonReiniciar.setOnClickListener{
            txtnumero1.text.clear()
            txtnumero2.text.clear()
            txtResultado.text = ""
        }

        val vista_4 = findViewById<View>(R.id.btn_siguienteVista) as Button
        vista_4.setOnClickListener {
            startActivity(Intent(this, Formulario::class.java))
        }
    }
}