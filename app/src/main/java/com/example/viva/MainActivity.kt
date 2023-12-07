package com.example.viva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn:Button=findViewById(R.id.btn1)
        btn.setOnClickListener()
        {
            var intent:Intent=Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
    }
}






