package com.example.nickolas.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.nio.file.Files.size
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var deciderTextView : TextView
    val dinnerOptions = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         deciderTextView = findViewById<TextView>(R.id.dinnerTextView)
        val button = findViewById<Button>(R.id.dinnerButton)
        button.setOnClickListener{
            decide()
        }
        dinnerOptions.add("Pizza")
        dinnerOptions.add("chiken")
    }

    fun decide (){
        println("Button click")

        deciderTextView.text = getRandomObject(dinnerOptions).toString()
    }

    private fun getRandomObject(from: Collection<*>): Any? {
        val rnd = Random()
        val i = rnd.nextInt(from.size)
        return from.toTypedArray()[i]
    }


}
