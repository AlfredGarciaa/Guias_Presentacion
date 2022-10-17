package edu.bo.ucb.oneapp

import MyUndoListener
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createSnackbar()
    }

    private fun createSnackbar() {
        var boton = findViewById<View>(R.id.btn_snackBar) as Button
        boton.setOnClickListener {
            Snackbar.make(it, "Button clicked", Snackbar.LENGTH_INDEFINITE)
                .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE)
                .setBackgroundTint(Color.parseColor("#000000"))
                .setAction("Action") {
                    Toast.makeText(this, "Snackbar button pressed!", Toast.LENGTH_SHORT).show()
                }.show()
        }
    }
}