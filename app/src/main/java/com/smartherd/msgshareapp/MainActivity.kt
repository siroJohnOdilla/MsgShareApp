package com.smartherd.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast.setOnClickListener{
            Log.i("MainActivity","Button was clicked")
            Toast.makeText(this, "The button was clicked", Toast.LENGTH_SHORT).show()
        }
        val btnSendMsgToNextActivity = findViewById<Button>(R.id.btnSendMsgToNextActivity)
        btnSendMsgToNextActivity.setOnClickListener{
            val etUserMessage = findViewById<EditText>(R.id.etUserMessage)
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }



    }
}