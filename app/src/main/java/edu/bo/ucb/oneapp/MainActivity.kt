package edu.bo.ucb.oneapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    private val channelID = "channelID"
    private val channelName = "channelName"

    private val notificationId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel()

        val notification = NotificationCompat.Builder(this, channelID).also {
            it.setContentTitle("You Tube - 'LATINOAMERICA'")
            it.setContentText("20:14 P.M    Los videos mas gracioso de gatos salvajes.")
            it.setSmallIcon(R.drawable.ic_message)
            it.setPriority(NotificationCompat.PRIORITY_HIGH)
        }.build()

        val notificationManager = NotificationManagerCompat.from(this)

        val btn_newNotificacion = findViewById<View>(R.id.btn_newNotification) as Button
        btn_newNotificacion.setOnClickListener {
            notificationManager.notify(notificationId, notification)
        }
    }

    private fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_HIGH

            val channel = NotificationChannel(channelID, channelName, importance).apply {
                //LightColor = Color.RED
                enableLights(true)
            }

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            manager.createNotificationChannel(channel)
        }
    }
}
