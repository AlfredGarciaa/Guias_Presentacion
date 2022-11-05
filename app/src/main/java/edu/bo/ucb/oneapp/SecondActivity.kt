package edu.bo.ucb.oneapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, session.user.nombre, Toast.LENGTH_LONG).show()
        Toast.makeText(this, session.user.apellido, Toast.LENGTH_LONG).show()
        // Convertimos la edad Int a String ya que la clase Toast siempre hay que pasarte un String para mostrar:
        val cadena: String = java.lang.String.valueOf(session.user.edad)
        Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show()
    }
}
