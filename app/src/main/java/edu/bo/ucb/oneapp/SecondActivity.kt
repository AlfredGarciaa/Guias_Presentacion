package edu.bo.ucb.oneapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Toast.makeText SOLO TIENE 5 NOTIFICACIONES COMO MAXIMO !!!

        // session -> empresa
        val text0 = "EMPRESA    ->  apolonix.software@gmail.com"
        val duration0 = Toast.LENGTH_LONG
        Toast.makeText(applicationContext, text0, duration0).show()

        // session -> agente
        val text1 = "........ AGENTE ........"
        val duration1 = Toast.LENGTH_LONG
        Toast.makeText(applicationContext, text1, duration1).show()
        Toast.makeText(this, session.user.agente, Toast.LENGTH_SHORT).show()

        // session -> edad
        val text3 = "........ EDAD ........"
        val duration3 = Toast.LENGTH_LONG
        Toast.makeText(applicationContext, text3, duration3).show()
            // Convertimos la edad Int a String ya que la clase Toast siempre hay que pasarte un String para mostrar:
            val cadena: String = java.lang.String.valueOf(session.user.edad)
            Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show()
    }
}
