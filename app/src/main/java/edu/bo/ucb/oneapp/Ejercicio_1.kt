package edu.bo.ucb.oneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        var txtnumero = findViewById<View>(R.id.text_numero) as EditText
        var boton = findViewById<View>(R.id.btn_calcular) as Button
        var txtresultado = findViewById<View>(R.id.text_respuesta) as TextView

        boton.setOnClickListener{
            var numero = txtnumero.text.toString().toInt()
            var calcular = Calcular(numero)
            txtresultado.text = calcular.toString()
        }
    }
    // Operacion de la funcion \\
    fun Calcular(numero: Int): String {
        if (numero % 2 == 0){
            return "El numero es PAR"
        }
        else{
            return "El numero es IMPAR"
        }
    }
}