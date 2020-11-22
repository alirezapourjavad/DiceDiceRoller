package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
//            for (a in 1..6) {
//                val showImage = when (a) {
//                    1 -> R.drawable.dice_1
//                    2 -> R.drawable.dice_2
//                    3 -> R.drawable.dice_3
//                    4 -> R.drawable.dice_4
//                    5 -> R.drawable.dice_5
//                    else -> R.drawable.dice_6
//                }
//                imageView.setImageResource(showImage)
//            }

            val random = getRandomNumber()
            val imageResource = when (random) {

                "1" -> R.drawable.dice_1
                "2" -> R.drawable.dice_2
                "3" -> R.drawable.dice_3
                "4" -> R.drawable.dice_4
                "5" -> R.drawable.dice_5
                else -> R.drawable.dice_6

            }
            imageView.setImageResource(imageResource)
            textView1.setText(random)
            Toast.makeText(this, random, Toast.LENGTH_SHORT).show()
        }
    }

    private fun getRandomNumber(): String {
//        val numberRandom = java.util.Random().nextInt(6) + 1
        val numberRandom = (1..6).random()
        return numberRandom.toString()


    }

}