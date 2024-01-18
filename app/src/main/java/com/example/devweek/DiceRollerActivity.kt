package com.example.devweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class DiceRollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller)
        val rollButton :Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this,"Dice rolled",Toast.LENGTH_SHORT).show()
            roll()
        }
    }

    private fun roll() {

        var randomRes = Random().nextInt(6)+1
        val drawableResource = when(randomRes)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        val dice:ImageView = findViewById(R.id.dice_image)
        dice.setImageResource(drawableResource)


    }
}