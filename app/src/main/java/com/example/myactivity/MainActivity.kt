package com.example.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val ivComPlay by lazy {findViewById<ImageView>(R.id.ivComPlay)}
    private val ibScissors by lazy {findViewById<ImageView>(R.id.ibScissors)}
    private val ibStone by lazy {findViewById<ImageView>(R.id.ibStone)}
    private val ibPaper by lazy {findViewById<ImageView>(R.id.ibPaper)}
    private val tvR by lazy {findViewById<TextView>(R.id.tvR)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibScissors.setOnClickListener {
            val  x = comPlay()

            when (x) {
                1 -> tvR.text = getString(R.string.draw)
                2 -> tvR.text = getString(R.string.lose)
                3 -> tvR.text = getString(R.string.win)

            }
        }
        ibStone.setOnClickListener {
            val  x = comPlay()

            when (x) {
                1 -> tvR.text = getString(R.string.win)
                2 -> tvR.text = getString(R.string.draw)
                3 -> tvR.text = getString(R.string.lose)

            }
        }
        ibPaper.setOnClickListener {
            val  x = comPlay()

            when (x) {
                1 -> tvR.text = getString(R.string.lose)
                2 -> tvR.text = getString(R.string.win)
                3 -> tvR.text = getString(R.string.draw)

            }
        }
    }
    private fun comPlay(): Int{
        val x=(Math.random()*3+1).toInt()

        when(x){
            1-> ivComPlay.setImageResource(R.drawable.scissors)
            2-> ivComPlay.setImageResource(R.drawable.stone)
            3-> ivComPlay.setImageResource(R.drawable.paper)
        }
        return x
    }

}