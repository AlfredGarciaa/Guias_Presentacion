package edu.bo.ucb.oneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private val toolbar: Toolbar get() = findViewById(R.id.toolbar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar.let {
            setSupportActionBar(toolbar)
        }
    }
}