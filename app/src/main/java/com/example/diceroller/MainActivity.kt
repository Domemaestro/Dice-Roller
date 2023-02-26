package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var rollBtn : Button
    private lateinit var dice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice = findViewById(R.id.dice_img)
        rollBtn = findViewById(R.id.roll_btn)

        rollBtn.setOnClickListener { rollDice() }
    }

    //Function to roll Dice
    fun rollDice(){
        // 1..6 specifying range from 1 to 6 (randomize number by using random() function )
        val randNo = (1..6).random()
        // The below when statement would basically be translated as (if {randNo} is {1} change the image resource
        when (randNo){
            1 -> dice.setImageResource(R.drawable.dice_1)
            2 -> dice.setImageResource(R.drawable.dice_2)
            3 -> dice.setImageResource(R.drawable.dice_3)
            4 -> dice.setImageResource(R.drawable.dice_4)
            5 -> dice.setImageResource(R.drawable.dice_5)
            6 -> dice.setImageResource(R.drawable.dice_6)
        }
    }
}