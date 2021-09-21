package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   lateinit var greetingTextView: TextView
   var name="Rai"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView= findViewById(R.id.textView)

    }



    fun buttonPressed(view: View) {
        greetingTextView.text= getString(R.string.new_greeting, name) // %1$s! e usando para o nome

    }


}

//1. översätt text i xml                     x
//2. översätt text som finns i kotlin-filer  x
//3. anpassa bilder