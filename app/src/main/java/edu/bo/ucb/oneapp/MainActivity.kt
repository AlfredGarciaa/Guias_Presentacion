package edu.bo.ucb.oneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayListOf<Usuario>()
        lista.add(Usuario("Roberto Carlos Callisaya Mamani", "calyr.software@gmail.com"))
        lista.add(Usuario("Gabriela Orosco Montaño", "gabriela_ocsoro@gmail.com"))

        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager
    }
}
