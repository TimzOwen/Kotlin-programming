package com.codewithtimzowen.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView // global and uses lanteint to make sure it will be assigned later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //crete a reference to the button to roll the dice
        val rollButton : Button = findViewById(R.id.btn_roll)

        //set an onclick listener to action on the button
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.ivRoll)
    }

    private fun rollDice(){

        // find the image and use when to replace with the right image (png and xml)
        val rolledImage = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(rolledImage)

    }

}
