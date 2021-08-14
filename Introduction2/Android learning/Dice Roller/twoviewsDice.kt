
package com.codewithtimzowen.twodiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btnRoll)

        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    // function to Roll and instantiate the class from DiceRoller
    private fun rollDice() {
        // Fetch the IDs
        val roll1 : TextView = findViewById(R.id.tv_rollDice1)
        val roll2 : TextView = findViewById(R.id.tv_rollDice2)

        // Roll depending on the number os sides on each Dice
        val dice = DiceRoller(6)
        val dice2 = DiceRoller(120)

        // pick an instance and attach it to the class . convert to string
        roll1.text = dice.rollDiceFun().toString()
        roll2.text = dice2.rollDiceFun().toString()

    }

    // create a class to Roll the dice (simplified Roll btn )
    class DiceRoller(private val numSides : Int){
        fun rollDiceFun() = (1..numSides).random()
        }

}
