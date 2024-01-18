package com.example.devweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonnext:Button = findViewById(R.id.btnnext)
        buttonnext.setOnClickListener {
            Toast.makeText(this,"Taking you to Dice Roller App",Toast.LENGTH_LONG).show()
            val Intent = Intent(this,DiceRollerActivity::class.java)
            startActivity(Intent)

                    }
    }
}