package com.example.exp5

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {

    private val channelId = "registration_channel"
    private val notificationId = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Find views from activity_main.xml
        val etName = findViewById<EditText>(R.id.etName)
        val etUSN = findViewById<EditText>(R.id.etUSN)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etMobile = findViewById<EditText>(R.id.etMobile)

        val spinnerCourse = findViewById<Spinner>(R.id.spinnerCourse)
        val checkTerms = findViewById<CheckBox>(R.id.checkTerms)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        // Course options
        val courses = arrayOf(
            "Select Course",
            "MCA",
            "MBA",
            "BCA",
            "B.Sc Computer Science",
            "B.Tech Computer Science"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            courses
        )

        spinnerCourse.adapter = adapter

        // Create notification channel
        createNotificationChannel()

        // Register button
        btnRegister.setOnClickListener {

            val name = etName.text.toString().trim()
            val usn = etUSN.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val mobile = etMobile.text.toString().trim()
            val course = spinnerCourse.selectedItem.toString()

            // Name validation
            if (name.isEmpty()) {
                etName.error = "Enter your name"
                etName.requestFocus()
                return@setOnClickListener
            }

            // USN validation
            if (usn.isEmpty()) {
                etUSN.error = "Enter your USN"
                etUSN.requestFocus()
                return@setOnClickListener
            }

            // Email validation
            if (email.isEmpty()) {
                etEmail.error = "Enter your email"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            // Mobile validation
            if (mobile.isEmpty()) {
                etMobile.error = "Enter your mobile number"
                etMobile.requestFocus()
                return@setOnClickListener
            }

            // Course validation
            if (course == "Select Course") {
                Toast.makeText(
                    this,
                    "Please select a course",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            // Terms validation
            if (!checkTerms.isChecked) {
                Toast.makeText(
                    this,
                    "Please accept Terms & Conditions",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            // Show notification
            showRegistrationNotification(name)

            Toast.makeText(
                this,
                "Registration Successful",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel = NotificationChannel(
                channelId,
                "Registration Notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            channel.description =
                "Notifications for successful student registration"

            val notificationManager =
                getSystemService(NOTIFICATION_SERVICE)
                        as NotificationManager

            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun showRegistrationNotification(name: String) {

        val notification = NotificationCompat.Builder(
            this,
            channelId
        )
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle("Registration Successful")
            .setContentText(
                "Welcome $name! Your registration is successful."
            )
            .setStyle(
                NotificationCompat.BigTextStyle()
                    .bigText(
                        "Welcome $name! Your student registration has been completed successfully."
                    )
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .build()

        if (
            Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        ) {

            val notificationManager =
                getSystemService(NOTIFICATION_SERVICE)
                        as NotificationManager

            notificationManager.notify(
                notificationId,
                notification
            )
        }
    }
}